import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a  = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        if (sc != null) {
            sc.close();
        }
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0 ; i < n ; i++) {
            map.put(a[i], i + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue());
            System.out.print(" ");
        }
    }

}