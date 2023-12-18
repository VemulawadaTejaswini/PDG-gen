import java.util.*;
import java.io.*;

public class Main {
    public static void multipleAdd(int[] data, int idx, int margin) {
        for (int i = 0; i <= idx; i++) {
            data[i] += margin;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc  = new Scanner(System.in);

        int arrayNum = sc.nextInt();
        int[] a = new int[arrayNum];
        int [] b = new int[arrayNum];

        for (int i = 0; i < arrayNum; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = arrayNum - 1; i >= 0; i--) {
            int objective = a[i];
            int base = b[i];
            int margin = 0;

            while (true) {
                if (objective % base != 0) {
                    objective++;
                    result++;
                    margin++;
                } else {
                    break;
                }
            }

            multipleAdd(a, i, margin);
        }

        System.out.println(result);
    }
}