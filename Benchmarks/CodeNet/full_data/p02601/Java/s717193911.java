import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int k = scn.nextInt();
        int A, B, C;

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= (k - i); j++) {
                int l = k-i-j;
                A = a * (int) Math.pow(2, i);
                B = b * (int) Math.pow(2, j);
                C = c * (int) Math.pow(2, l);
                if (C > B && B > A) {
                    System.out.println("Yes");
                    return;
                }

            }
        }

        System.out.println("No");


        scn.close();

    }


}
