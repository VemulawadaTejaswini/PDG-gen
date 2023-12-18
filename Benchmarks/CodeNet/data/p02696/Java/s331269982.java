import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();

        long X = B;
        if (N >= B -1) {
            X = B - 1;
        }
        long ans = A * X /B - A * ( X / B);
        System.out.println(ans);
    }
}