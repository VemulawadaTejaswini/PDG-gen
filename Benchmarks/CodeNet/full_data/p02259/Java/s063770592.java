import java.util.*;
import java.lang.*;

/**
 * BubbleSort
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(sc.next());
        }

        int num = MyBubbleSort(list, n);

        for (int i = 0; i < list.length; i++) {
            if (i == list.length - 1) {
                System.out.print(list[i]);

            } else {
                System.out.print(list[i] + " ");
            }
        }
        System.out.println("");
        System.out.println(num);

    }

    private static int MyBubbleSort(int[] list, int n) {
        int num = 0;
        boolean flag = true; // 逆の隣接要素が存在する
        while (flag) {
            flag = false;

            for (int j = n - 1; j >= 1; j--) {
                if (list[j] < list[j - 1]) {
                    int tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                    flag = true;
                    num++;
                }
            }
        }

        return num;
    }
}
