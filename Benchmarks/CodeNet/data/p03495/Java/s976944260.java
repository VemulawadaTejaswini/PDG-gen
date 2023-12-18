import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Map<Integer, Integer> valueToCount = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            if (valueToCount.containsKey(value)) {
                valueToCount.put(value,  valueToCount.get(value)+ 1);
            } else {
                valueToCount.put(value, 1);
            }
        }

        List<Integer> counts = new ArrayList<>();
        for (Integer count : valueToCount.values()) {
            counts.add(count);
        }
        Collections.sort(counts);

        int ans = 0;
        for (int i = 0; i < counts.size() - K; i++) {
            ans += counts.get(i);
        }

        System.out.println(ans);
    }
}