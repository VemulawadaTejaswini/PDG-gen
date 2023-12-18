import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        for(int i = A; i < Math.min(A+K, B+1); i++) System.out.println(i);
        for(int i = Math.max(B-K+1, A+K); i <= B; i++) System.out.println(i);
        sc.close();

    }

}
