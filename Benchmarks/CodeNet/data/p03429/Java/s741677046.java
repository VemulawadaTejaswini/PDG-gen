import java.util.*;

public class Main {
    static char[][] c;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        c = new char[n][m];
        if(n * m > 2 * (a + b)) {
            System.out.println("NO");
        }
        if(n % 2 == 0) {
            if(n % 2 == 0) {
                if(n * m == 2 * (a + b) && a % 2 == 1) {
                    System.out.println("NO");
                    return;
                }
                int ca = 0;
                for (int i = 0; i <n % 2 ; i++) {
                    for (int j = 0; j < m % 2; j++) {
                        if(ca == a) {
                            break;
                        }
                        putAS(2 *i, 2* j);
                        ca ++;
                    }
                    if(ca == a) {
                        break;
                    }
                }
                int cb = 0;
                ca = 0;
                for (int i = 0; i <n % 2 ; i++) {
                    for (int j = 0; j < m % 2; j++) {
                        if(ca < a) {
                            ca++;
                            continue;
                        }
                        if(cb == b) {
                            break;
                        }
                        putAS(2 *i, 2* j);
                        ca ++;
                    }
                    if(cb == a) {
                        break;
                    }
                }

            }
            else {

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((c[i][j] == 0) ? '.' : c[i][j]);
            }
        }
    }

    static void putAS(int i, int j){
        c[i][j] = '<';
        c[i+1][j] = '>';
        c[i][j+1] = '<';
        c[i+1][j+1] = '>';
    }

    static void putBS(int i, int j){
        c[i][j] = '^';
        c[i+1][j] = '^';
        c[i][j+1] = 'v';
        c[i+1][j+1] = 'v';
    }
}
