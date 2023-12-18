
import java.util.Scanner;

class Main {

    int[] abc;

    Main(int[] abc) {
        this.abc = abc;
    }

    String solve() {

        final String YES = "YES";
        final String NO = "NO";

        int n5 = 0;
        int n7 = 0;

        for (int i = 0; i < 3; i++) {
            if (abc[i] == 5) {
                n5++;
            } else if (abc[i] == 7) {
                n7++;
            }
        }

        if (n5 == 2 && n7 == 1) {
            return YES;
        } else {
            return NO;
        }
    }

    public static void main(String args[]) {
        // input
        int[] abc = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            abc[i] = sc.nextInt();
        }
        sc.close();

        // solve
        String greeting = new Main(abc).solve();

        // display
        System.out.println(greeting);
    }
}