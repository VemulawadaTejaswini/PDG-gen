package jp.atcoder.bc179;

import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int n = word.length();
        if (word.charAt(n-1) != 's')
            System.out.println(word + "s");
        else if (word.charAt(n-1) == 's')
            System.out.println(word + "es");
    }
}
