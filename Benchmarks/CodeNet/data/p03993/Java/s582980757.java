
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }

        int pair = 0;
        for (int i = 0; i < num; i++) {
            if (a[a[i] - 1] - 1 == i) {
                pair++;
            }
        }

        System.out.println(pair/2);
    }
}