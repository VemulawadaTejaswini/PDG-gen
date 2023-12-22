import java.util.*;

class Main {

    static void solve (int[] a, int[] b) {
        
        int hit = 0;
        int blow = 0;

        for (int i = 0; i < 4; i++) {
            if (a[i] == b[i]) {
                hit += 1;
            } else {
                for (int j = 0; j < 4; j++) {
                    if ( a[i] == b[j] ) blow += 1;
                }
            }
        }

        System.out.printf("%d %d\n", hit, blow);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            
            int [] a = new int [4];
            int [] b = new int [4];

            for (int i = 0; i < 4; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < 4; i++) {
                b[i] = sc.nextInt();
            }

            solve(a, b);

        }

    }
}