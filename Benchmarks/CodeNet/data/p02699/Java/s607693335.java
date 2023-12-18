

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int s = sc.nextInt();
        int w = sc.nextInt();
        if (w >= s / 2) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
