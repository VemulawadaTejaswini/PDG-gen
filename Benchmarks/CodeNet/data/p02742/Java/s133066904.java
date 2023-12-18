import java.util.Scanner;

/**
 * TITLE : Bishop
 * URL : https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_b
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        if (H == 1 || W == 1) {
            System.out.println(1);
        } else {
            System.out.println((H * W / 2) + (H * W % 2));
        }
        sc.close();
    }
}