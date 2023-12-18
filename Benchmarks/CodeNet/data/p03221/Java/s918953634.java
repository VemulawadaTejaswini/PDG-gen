import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int p[] = new int[m];
        int y[] = new int[m];
        for(int i=0; i<m; i++) {
            p[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        int b[] = new int[m];
        for(int i=0; i<m; i++) {
            int pre = p[i];
            int c = 1;
            for(int j=0; j<m; j++) {
                if(i != j && p[i] == p[j]) {
                    if(y[i] > y[j]) {
                        c++;
                    }
                }
                b[i] = c;
            }
        }

        for(int i=0; i<m; i++) {
            System.out.printf("%06d%06d", p[i], b[i]);
            System.out.println();
        }

        in.close();
    }
}