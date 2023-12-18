

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int d = sc.nextInt();
        int n = sc.nextInt();

        if (d == 0) {
            System.out.println(n);
        } else {
            System.out.println((int) Math.pow(100, d) * n);
        }
    }
}
