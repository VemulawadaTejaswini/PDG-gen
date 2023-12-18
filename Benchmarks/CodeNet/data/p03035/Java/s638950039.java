

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 13) {
            System.out.println(b);
        } else if (a >= 6) {
            System.out.println(b / 2);
        } else {
            System.out.println(0);
        }
    }
}
