import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][][] m = new int[4][3][10];
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 3; ++j) {
                for(int k = 0; k < 10; ++k) {
                    m[i][j][k] = 0;
                }
            }
        }
        for(int i = 0; i < n; ++i) {
            m[s.nextInt()-1][s.nextInt()-1][s.nextInt()-1] += s.nextInt();
        }
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 3; ++j) {
                for(int k = 0; k < 10; ++k) {
                    System.out.print(" " + m[i][j][k]);
                }
                if(j < 2 || i < 3)System.out.println();
            }
            if(i < 3) System.out.println("####################");
        }
    }
}