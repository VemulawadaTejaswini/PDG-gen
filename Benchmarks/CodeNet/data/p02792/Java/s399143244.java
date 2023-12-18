
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 10) {
            System.out.println(n);
            return;
        }
        long c = 0;
        int[][] d = new int[10][10];
        for (int i = 1 ; i <= n ; i++) {
            int a = i % 10;
            String s = String.valueOf(i);
            int b = Integer.valueOf(s.substring(0,1));
            d[a][b]++;
        }

        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                c += d[i][j] * d[j][i];
            }
        }




        System.out.println(c);


    }

}
