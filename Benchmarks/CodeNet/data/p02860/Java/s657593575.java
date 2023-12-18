import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        if (n % 2 != 0) {
            System.out.println("No");
            System.exit(0);
        }

        String ans = "Yes";
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(i + n / 2)) {
                ans = "No";
                break;
            }
        }
        System.out.println(ans);

    }

}
