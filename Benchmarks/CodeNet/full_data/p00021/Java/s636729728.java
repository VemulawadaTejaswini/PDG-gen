/*
 * Parallelism
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0021&lang=jp
 *
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();

        for(int i=0; i < loop; i++){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            double x4 = sc.nextDouble();
            double y4 = sc.nextDouble();

            if((y1 - y2) / (x1 - x2) == (y3 - y4) / (x3 - x4)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

