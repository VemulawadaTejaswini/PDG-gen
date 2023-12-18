
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 100;
        char[][] ch = new char[n][n];
        for (int i = 0; i < n/2; i++) {
            Arrays.fill(ch[i], '#');
        }
        for (int i = n/2; i < n; i++) {
            Arrays.fill(ch[i], '.');
        }
        
        int h = 1;
        int w = 1;
        for (int i = 1; i < a; i++) {
            ch[h][w] = '.';
            w += 2;
            if (w >= n-1) {
                w = 1;
                h += 2;
            }
        }
        
        h = 51;
        w = 1;
        
        for (int j = 1; j < b; j++) {
            ch[h][w] = '#';
            w += 2;
            if (w >= n-1) {
                w = 1;
                h += 2;
            }
        }
        
        System.out.println("100 100");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch[i][j]);
            }
            System.out.println();
        }
    }
}

