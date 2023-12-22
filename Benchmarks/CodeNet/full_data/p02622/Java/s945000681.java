package javaapplication166;

import java.util.Scanner;

public class JavaApplication166 {

    public static void main(String[] args) {
        String S, T;
        Scanner scan = new Scanner(System.in);
        S = scan.next();
        T = scan.next();

        int a = 0, p;
        p = S.length();
        String[] data = S.split("");
        String[] info = T.split("");
        for (int i = 0; i < p; i++) {
            if (data[i].equals(info[i])) {

            } else {
                a++;

            }
        }
        System.out.print(a);
    }

}
