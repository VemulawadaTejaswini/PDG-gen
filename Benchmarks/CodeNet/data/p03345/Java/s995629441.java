import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();
        long th = (long) Math.pow(10, 18);
        if (k % 2 == 0) {
            long ans = a-b;
            if (ans > th || -ans > th) {
                System.out.println("Unfair");
            } else {
                System.out.println(ans);
            }
        } else {
            long ans = b-a;
            if (ans > th || -ans > th) {
                System.out.println("Unfair");
            } else {
                System.out.println(ans);
            }
        }
    }
}