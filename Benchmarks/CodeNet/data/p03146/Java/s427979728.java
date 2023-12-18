import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int an = a1;
        int n = 1;
        int anArray[] = new int[1000000];
        anArray[0] = an;

        for (int i = 0; ; i++) {
            //System.out.println(an);
            n += 1;
            if (an % 2 == 0) {
                an = an / 2;
            } else {
                an = 3 * an + 1;
            }

            for (int j = 0; j < i; j++) {
                if (an == anArray[j]) {
                    System.out.println(n);
                    System.exit(0);
                }
            }

            anArray[n - 1] = an;
        }
    }
}