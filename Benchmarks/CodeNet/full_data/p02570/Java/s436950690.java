//package src.com.jetman.atcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    private void slove() {
        long d = sc.nextLong();
        long t = sc.nextLong();
        long s = sc.nextLong();



        System.out.println((double)d/s > t  ? "No":"Yes");
    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
