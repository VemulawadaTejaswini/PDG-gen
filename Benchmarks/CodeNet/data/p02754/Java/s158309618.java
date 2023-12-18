import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long result = 0;
        while(0 < N) {
            result += Math.min(A, N);
            N-=(A+B);
        }
        System.out.println(result);
    }
}