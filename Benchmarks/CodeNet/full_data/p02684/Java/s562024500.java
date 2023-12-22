import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        long k = Long.parseLong(line[1]);
        String[] a = sc.nextLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, Integer.parseInt(a[i - 1]));
        }
        // 出力
        int town = 1;
        long count = 0;
        while (count < k + 1) {
            town = map.get(town);
            count++;
        }
        System.out.println(town);
    }
}
