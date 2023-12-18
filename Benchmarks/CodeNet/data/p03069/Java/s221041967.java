
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
        char c1;
        char c2;

        for (int i = 0; i < x1; i++) {
            c1 = s.charAt(i);
            if (i + 1 < x1) {
                c2 = s.charAt(i + 1);
                if (c1 == '#' && c2 == '.')
                    cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
