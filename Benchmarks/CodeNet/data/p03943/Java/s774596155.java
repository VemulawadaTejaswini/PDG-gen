import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(a)
        int a = sc.nextInt();
        // 入力(b)
        int b = sc.nextInt();
        // 入力(c)
        int c = sc.nextInt();
        int[] ary = {a, b, c};

        Arrays.sort(ary);
        System.out.println((ary[0] + ary[1] == ary[2] ? "Yes" : "No"));
        sc.close();
    }
}