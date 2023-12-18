import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        Map<Integer, Integer> red = new TreeMap<>();
        Map<Integer, Integer> blue = new TreeMap<>();
        int[] used = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            red.put(a[i], b[i]);
        }
        for (int i = 0 ; i < n ; i++) {
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
            blue.put(c[i], d[i]);
        }
        int count = 0;
        for (Entry<Integer,Integer> entry : blue.entrySet()) {
            int bx = entry.getKey();
            int by = entry.getValue();
            int maxY = -1;
            int index = -1;
            for (int i = 0 ; i < n ; i++) {
                int rx = a[i];
                int ry = b[i];
                if (bx > rx && by > ry && used[i] == 0 && maxY < ry) {
                    maxY = ry;
                    index =i;
                }
            }
            if (index >= 0) {
                count++;
                used[index] = 1;
            }
        }
        System.out.println(count);


    }

}