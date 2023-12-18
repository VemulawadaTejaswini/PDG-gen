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
        map.put(0, 1L);
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
//        System.out.println("while" + queue);
        while (!queue.isEmpty()) {
            int pollValue = queue.poll();
            long valueCount = map.get(pollValue);
            // 1段上がる場合
            int one = pollValue + 1;
            if (one <= N) {
                if (one == N) {
                    count += valueCount;
                } else if (!aList.contains(one)) {
                    if (map.containsKey(one)) {
                        long oneCount = map.get(one);
                        oneCount += (valueCount);
                        map.put(one, oneCount);
                    } else {
                        queue.add(one);
                        map.put(one, valueCount);
                    }
                }
            }
            // 2段上がる場合
            int two = pollValue + 2;
            if (two <= N) {
                if (two == N) {
                    count += valueCount;
                } else if (!aList.contains(two)) {
                    if (map.containsKey(two)) {
                        long twoCount = map.get(two);
                        twoCount += (valueCount);
                        map.put(two, twoCount);
                    } else {
                        queue.add(two);
                        map.put(two, valueCount);
                    }
                }
            }
            count = count % calcValue;
//            System.out.println("while" + queue);
        }

//        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " / " + entry.getValue()));

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }

    private static int search(int before) {
        return 0;
    }
}
