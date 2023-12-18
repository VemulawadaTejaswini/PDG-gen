import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        long start1 = System.currentTimeMillis();
//        long end1 = System.currentTimeMillis();
//        System.out.println("time1: " + (end1 - start1));

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        String[] arr = scanner.nextLine().split(" ");

        long[] aArray = new long[n];
        Map<Long, Long> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(arr[i]);
            aArray[i] = num;
            if (map.containsKey(num)) {
                Long count = map.get(num);
                map.put(num, count + 1);
            } else {
                map.put(num, 1L);
            }
        }

        for (int k = 1; k <= n; k++) {
            // k番目のボールを除く
            Long num = aArray[k - 1];
            Long count = map.get(num);
            map.put(num, count - 1);

            // 同じ整数のボールを2つ選ぶ組み合わせ数を計算する
            int result = 0;
            for (Long key : map.keySet()) {
                Long j = map.get(key);
                result += j * (j - 1) / 2;
            }
            System.out.println(result);

            // K番目のボールを元に戻す
            map.put(num, count);
        }
    }
}
