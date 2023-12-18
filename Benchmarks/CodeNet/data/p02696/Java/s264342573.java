import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        long B = sc.nextLong();
        long N = sc.nextLong();

        long x = Math.min(B-1,N);
        long ans = A*x/B - A*(x/B);
        System.out.println(ans);
    }
}
