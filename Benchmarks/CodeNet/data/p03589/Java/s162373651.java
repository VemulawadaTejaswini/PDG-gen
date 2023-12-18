
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = (long) scanner.nextInt();
        int[] theOne = new int[3500];
        for (int i = 0; i < 3500; i++) theOne[i] = i+1;

        for (long j = 1; j <= 3500; j++) {
            for (long k = 1; k <= 3500;k++) {
                long x = (j * k * N);
                long y = 4 * j * k - N * (j + k);
                if (y != 0) {
                    int thatOne = binarySearch(theOne, x, y, 0, theOne.length - 1);
                    if (thatOne > 0) {
                        System.out.println(j + " " + k + " " + thatOne);
                        return;
                    }
                }
            }
        }
    }

    private static int binarySearch(int[] field, long x, long y, int start, int end) {
        if (start > end || start >= field.length || end < 0) return -1;
        int mid = (start + end) / 2;
        if (field[mid] * y < x) return binarySearch(field, x, y, mid + 1, end);
        else if (field[mid] * y > x) return binarySearch(field, x, y, start, mid - 1);
        else return field[mid];
    }

}


