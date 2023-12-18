import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int ans = 999;
        int end = len - 2;
        for (int i = 0; i < end; i++) {
            ans = Math.min(ans, Math.abs(Integer.parseInt(s.substring(i, i + 3)) - 753));
        }
        System.out.println(ans);
        sc.close();
    }
}
