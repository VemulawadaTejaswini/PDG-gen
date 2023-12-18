

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int a;
        int count = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            if (a % 2 == 0) {
                int j = 1;
                boolean b = true;
                while (b) {
                    int c = (int) Math.pow(2, j);
                    if (a % c == 0) {
                        count++;
                        j++;
                    } else {
                        b = false;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
