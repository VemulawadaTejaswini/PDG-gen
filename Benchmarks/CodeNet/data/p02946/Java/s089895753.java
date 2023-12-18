import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static int mod = (int) 10e9 + 7;

    public static void main(String[] args) {
        int k = sc.nextInt();
        int x = sc.nextInt();
        for (int i = x -  k + 1; i < x + k; i++) {
            System.out.println(i);
        }
    }

    private static int maxInt(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }

    private static long maxLong(long[] array) {
        long max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }

    private static int minInt(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    private static long minLong(long[] array) {
        long min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

}
