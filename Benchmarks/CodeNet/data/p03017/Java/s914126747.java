import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String[] s = sc.next().split("");
        for (int i = 0; i < n - 1; i++) {
            if ("#".equals(s[i]) && "#".equals(s[i + 1])) {
                System.out.println("No");
                return;
            }
        }
        if (c < d) {
            System.out.println("Yes");
            return;
        }
        boolean canOvertake = false;
        for (int i = 0; i < n - 2; i++) {
            if (".".equals(s[i]) && ".".equals(s[i + 1]) && ".".equals(s[i + 2])) {
                canOvertake = true;
            }
        }
        if (canOvertake) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
