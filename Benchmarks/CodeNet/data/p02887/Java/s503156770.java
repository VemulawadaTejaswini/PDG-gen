import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        int cnt = 1;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i + 1) != s.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}