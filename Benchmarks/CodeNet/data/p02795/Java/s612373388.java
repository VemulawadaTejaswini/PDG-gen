//package unk;

import java.util.Scanner;

/**
 * @author sguar <shugangcao@gmail.com>
 * welcome to kuaishou
 * Created on 2020-01-10
 */
public class Main {

    public void run() {
        Scanner cin = new Scanner(System.in);
        int h = cin.nextInt();
        int w = cin.nextInt();
        int n = cin.nextInt();
        h = Math.max(h, w);
        int ans = n / h;
        if (n % h != 0) ans++;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
