import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int[][][] people = new int[4][3][10];
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            
            people[b-1][f-1][r-1] += v;
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    if (k != 9) {
                        System.out.printf(" %d", people[i][j][k]);
                    }
                    else {
                        System.out.printf(" %d\n", people[i][j][k]);
                    }
                }
            }
            if (i != 3) {
                System.out.println("####################");
            }
        }
    }
}