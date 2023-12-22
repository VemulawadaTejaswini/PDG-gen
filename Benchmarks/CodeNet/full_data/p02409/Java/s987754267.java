import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int[][][] r = new int[4][3][10];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        	int b =sc.nextInt() - 1;
        	int c =sc.nextInt() - 1;
        	int d =sc.nextInt() - 1;
        	int e =sc.nextInt();
            r[b][c][d] += e;
        }
        for (int i = 0; i < 4; ++i) {
            if (i != 0) {
                System.out.println("####################");
            }
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(" " + r[i][j][k]);
                }
                System.out.println();
            }
        }
        }


    }