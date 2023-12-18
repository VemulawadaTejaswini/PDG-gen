import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();

        if (s.substring(Math.min(a, c) - 1, Math.max(a, c)).contains("##")) {
            System.out.println("No");
            return;
        }
        if (s.substring(Math.min(b, d) - 1, Math.max(b, d)).contains("##")) {
            System.out.println("No");
            return;
        }
        if (c > d) {
            System.out.println(s.substring(b - 2, Math.min(n, d + 1)).contains("...") ? "Yes" : "No");
            return;
        }

        System.out.println("Yes");
    }
}