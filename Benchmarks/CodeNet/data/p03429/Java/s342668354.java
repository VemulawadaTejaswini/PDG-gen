import java.util.*;

public class Main {
    static char[][] c;
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        c = new char[n][m];
        if(n * m < 2 * (a + b)) {
            System.out.println("NO");
            return;
        }
        if(m % 2 == 0) {
            if(n % 2 == 0) {
                if(n * m == 2 * (a + b) && a % 2 == 1) {
                    System.out.println("NO");
                    return;
                }
                int ca = 0;
                for (int i = 0; i < n / 2 ; i++) {
                    for (int j = 0; j < m / 2; j++) {
                        if(ca == a) {
                            break;
                        }
                        if(a - ca != 1) {
                            putAS(2 * i, 2 * j);
                            ca += 2;
                        }
                        else {
                            putAs(2 * i, 2 * j);
                            ca++;
                        }
                    }
                    if(ca == a) {
                        break;
                    }
                }
                int cb = 0;
                ca = 0;
                for (int i = 0; i <n / 2 ; i++) {
                    for (int j = 0; j < m / 2; j++) {
                        if(ca < a) {
                            ca += 2;
                            continue;
                        }
                        if(cb == b) {
                            break;
                        }
                        if(b - cb != 1) {
                            putBS(2 *i, 2* j);
                            cb += 2;
                        }
                        else {
                            putBs(2 *i, 2* j);
                            cb++;
                        }

                    }
                    if(cb == b) {
                        break;
                    }
                }

            }
            else {

            }
        }
        char[] line = new char[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                line[j] = (c[j][i] == 0) ? '.' : c[j][i];
            }
            System.out.println(new String(line));
        }
    }

    static void putAS(int i, int j){
        c[i][j] = '<';
        c[i+1][j] = '>';
        c[i][j+1] = '<';
        c[i+1][j+1] = '>';
    }
    static void putAs(int i, int j){
        c[i][j] = '<';
        c[i+1][j] = '>';
    }
    static void putBS(int i, int j){
        c[i][j] = '^';
        c[i+1][j] = '^';
        c[i][j+1] = 'v';
        c[i+1][j+1] = 'v';
    }
    static void putBs(int i, int j){
        c[i][j] = '^';
        c[i][j+1] = 'v';
    }
}
