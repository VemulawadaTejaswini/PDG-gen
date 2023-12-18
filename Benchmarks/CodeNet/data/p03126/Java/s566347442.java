import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] k = new Integer[n];
        ArrayList<Integer[]> aList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            k[i] = Integer.parseInt(sc.next());
            Integer[] a = new Integer[k[i]];
            for (int j = 0; j < k[i]; j++) {
                a[j] = Integer.parseInt(sc.next());
            }
            aList.add(a);

        }

        Integer[] count = new Integer[m];
        for (int i = 0; i < m; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k[i]; j++) {
                count[aList.get(i)[j] - 1]++;
            }
        }

        int result = 0;
        for (int c : count) {
            if (c == n) {
                result++;
            }
        }

        System.out.println(result);
    }
}