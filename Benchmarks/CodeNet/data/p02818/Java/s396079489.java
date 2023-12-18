import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        StringBuilder sb = new StringBuilder();

        if (A >= K) {
            sb.append(A-K);
            sb.append(" ");
            sb.append(B);
            System.out.println(sb.toString());
        } else if (B >= K - A) {
            sb.append(0);
            sb.append(" ");
            sb.append(B- K + A);
            System.out.println(sb.toString());
        } else {
            System.out.println("0 0");
        }
    }
}
