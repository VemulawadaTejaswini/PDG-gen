import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            if (num<3)
                break;

            if (i==3)
                System.out.printf(" %d", i);
            else {
                if (i % 3 == 0) {
                    System.out.printf(" %d", i);
                }
                if (i % 10 == 3) {
                    System.out.printf(" %d", i);
                }
            }
        }
        System.out.printf("\n");
    }

}

