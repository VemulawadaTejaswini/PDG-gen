import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        boolean flag = true;
        if (a[0] != 1)
            flag = false;
        if (a[1] != 4)
            flag = false;
        if (a[2] != 7)
            flag = false;
        if (a[3] != 9)
            flag = false;
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}