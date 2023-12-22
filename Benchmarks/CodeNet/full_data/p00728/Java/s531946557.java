import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int[] p = new int[a];
        int big = 0;
        int small = 100000;
        int sum = 0;
        for (int i = 0; i < a; i++) {
            p[i] = cs.nextInt();
            if (big < p[i]) {
                big = p[i];
            }
            if (small > p[i]) {
                small = p[i];
            }
            sum = sum + p[i];
        }
        sum = sum - big - small;
        sum = sum / (a - 2);

        System.out.println(sum);
    }
}

