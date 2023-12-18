

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {

        int n, k, x, y, total1 = 0, total2 = 0, total;

        Scanner input = new Scanner(System.in);

       // System.out.print("Total Night: ");

        n = input.nextInt();

        //System.out.print("First Night: ");

        k = input.nextInt();

        //System.out.print("X = ");

        x = input.nextInt();

        //System.out.print("Y = ");

        y = input.nextInt();

        if ((n >= 1 && n <= 10000) && (k >= 1 && k <= 10000)) {

            if ((x >= 1 && x <= 10000) && (y >= 1 && y <= 10000)) {

                for (int i = 1; i <= k; i++) {

                    total1 = total1 + x;
                }

                for (int i = 1; i <= n - k; i++) {

                    total2 = total2 + y;
                }
            }
        }


        total = total1 + total2;

        System.out.println(total);
    }
    
}
