
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int times = Integer.parseInt(sc.nextLine());
        // int bit = 0;

        int x1 = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        int x2 = Integer.parseInt(sc.nextLine());

        char c1 = s.charAt(x2 - 1);
        char c2;

        String a = "";

        for (int i = 0; i < x1; i++) {
            c2 = s.charAt(i);

            if (c2 == c1) {
                a = a + c2;
            } else {
                a = a + '*';
            }

        }

        System.out.println(a);
        sc.close();
    }
}
