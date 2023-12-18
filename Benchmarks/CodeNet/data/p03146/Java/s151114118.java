import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int an = a1;
        int n = 1;

        for (int i = 0; ; i++ ) {
            n += 1;
            if (an % 2 == 0) {
                an = an / 2;
                //System.out.println(an);
            } else {
                an = 3 * an + 1;
                //System.out.println(an);
            }
            if (an == 4) {
                System.out.println(n + 3);
                break;
            }
        }
        //System.out.println(n + 3);
    }
}