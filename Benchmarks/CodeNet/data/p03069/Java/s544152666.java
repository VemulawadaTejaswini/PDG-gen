
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int times = Integer.parseInt(sc.nextLine());
        // int bit = 0;

        int x1 = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        int t1 = s.indexOf("#");

        int cnt = 0;

        while (true) {
            if (t1 < 0)
                break;
            if (s.charAt(t1 + 1) == '.') {
                cnt++;
            }

            t1 = s.indexOf("#", t1 + 1);
            if (t1 >= x1 - 1) {
                break;
            } else if (t1 < 0) {
                break;
            }

        }

        System.out.println(cnt);
        sc.close();
    }
}
