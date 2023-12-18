import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            aList.add(scanner.nextInt());
        }
        scanner.close();
        long count = 0;
        long calcValue = 1000000007;

        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                map.put(0, 1L);
            } else {
                map.put(i, 0L);
            }
        }
        List<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            targetList.add(i);
        }
        targetList.removeAll(aList);

        for (int i : targetList) {
            long valueCount = map.get(i);
            // 1段上がる場合
            int one = i + 1;
            if (one == N) {
                count += valueCount;
                count = count % calcValue;
            } else if (one < N) {
                long oneCount = map.get(one);
                oneCount += (valueCount);
                map.put(one, oneCount);
            }
            // 2段上がる場合
            int two = i + 2;
            if (two == N) {
                count += valueCount;
                count = count % calcValue;
            } else if (two < N) {
                long twoCount = map.get(two);
                twoCount += (valueCount);
                map.put(two, twoCount);
            }
        }

        System.out.println(count);
    }
}
