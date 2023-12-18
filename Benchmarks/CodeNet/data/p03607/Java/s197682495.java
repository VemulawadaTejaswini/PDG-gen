import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if (map.get(tmp) == null) {
                map.put(tmp, 1);
            } else {
                map.put(tmp, map.get(tmp) + 1);
            }
        }

        int count = 0;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}