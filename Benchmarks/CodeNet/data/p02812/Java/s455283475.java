package atCoder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        String[] str = s.split("ABC");

        System.out.println(str.length - 1);

    }
}
