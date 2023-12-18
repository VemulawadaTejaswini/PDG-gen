
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());

        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        Integer[] sortedArray = Arrays.copyOf(a, a.length);
        Arrays.sort(sortedArray, Collections.reverseOrder());

        long sum = 0;
        int head = 0;
        int tail = a.length - 1;
        for (int j = 0; j < n; j++) {
            if (j != 0 && sortedArray[j] == sortedArray[j - 1]) {
                continue;
            }
            int aVal = sortedArray[j];

            List<Integer> indexList = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (aVal == a[i]) {
                    indexList.add(i);
                }
            }

            for (int index : indexList) {
                if (index >= n / 2) {
                    sum += Math.abs(index - head) * (long)aVal;
                    head++;
                } else {
                    sum += Math.abs(index - tail) * (long)aVal;
                    tail--;
                }
            }
        }

        System.out.println(sum);
    }

}
