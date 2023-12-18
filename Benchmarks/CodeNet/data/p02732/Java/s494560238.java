import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] list = new Integer[N];
        for (int i = 0; i < N; i++) {
            list[i] = scanner.nextInt();
        }
        int total = 0;
        int subtotal = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (list[i] == list[j]) {
                    total++;
                    subtotal++;
                }
            }
            if (!map.containsKey(list[i])) {
                map.put(list[i], subtotal);
            }
            subtotal = 0;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(total - Math.max(map.get(list[i]), 0));
        }
    }
}