
import java.util.Scanner;

/**
 * Created by codoge on 2017/6/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        printColors(a);
    }

    private static void printColors(int[] a) {
        int have = 0, free = 0;
        int[] color = new int[8];
        for (int i = 0; i < a.length; i++) {
            if (a[i]/400 >= 8) {
                free++;
            }else if (color[a[i]/400] == 0) {
                color[a[i]/400] = 1;
                have++;
            }
        }

        if (have < 8) {
            System.out.print(have+ " ");
            if (free <= (8 - have)) {
                System.out.println(have+free);
            } else {
                System.out.println(8);
            }
        } else {
            System.out.println("8 8");
        }
    }
}
