
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(solve(K, A, B));
    }

    public static long solve(int K, int A, int B){
        long count = 0;

        if (A >= B-2)   return K+1;
        if (A-1 > K-2) return K+1;

        count = B;
        K = K-(A-1)-2;

        count += (int)K/2 * (long)(B-A) + K%2;

        return count;
    }
}