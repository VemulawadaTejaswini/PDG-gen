
import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = in.nextInt();

        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        int first = -1;
        int second = -1;


        int times = 1;

        while (true) {


            if (eq(a, arr)) {
                first = times;
            } else if (eq(b, arr)) {
                second = times;
            }

            if (first != -1 && second != -1) {
                break;
            }

            if (!nextPermutation()) {
                break;
            }
            times++;



        }

        System.out.println((int) Math.abs(first - second));


    }
    static boolean nextPermutation() {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }
        int j = arr.length - 1;
        while (arr[j] <= arr[i - 1]) {
            j--;
        }
        swap(i-1, j);
        j = arr.length - 1;
        while (i < j) {
            swap(i, j);
            i++;
            j--;
        }
        return true;
    }//NP

    static void swap(int i, int j) {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }


    static boolean eq(int[] a, int[] b) {


        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {
                return false;
            }

        }
        return true;


    }


}
