import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        double ans = 0;
        int result = Integer.parseInt(a + b);
        ans = Math.sqrt(result);
        int re = (int) ans;
        if (ans == re) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}