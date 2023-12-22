import java.util.*;

public class Main {
    static void swap(int[] x, int i, int j) {
        int tmp = x[i];
        x[i] = x[j];
        x[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        if(a[0] > a[1]) swap(a, 0, 1);
        if(a[1] > a[2]) swap(a, 1, 2);
        if(a[0] > a[1]) swap(a, 0, 1);
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}
