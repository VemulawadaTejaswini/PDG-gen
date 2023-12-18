import java.util.Scanner;

/**
 * TITLE : Kth Term
 * URL : https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_a
 */
public class Main {
    public static void main(String args[]) {
        int[] array = { 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51 };

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        System.out.println(array[K - 1]);
        sc.close();
    }
}