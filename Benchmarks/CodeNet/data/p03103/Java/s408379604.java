import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), M = scanner.nextInt();
        Map<Integer, Integer> drinks = new HashMap<>();
        for(int i = 0; i < N; i++){
            Integer key = scanner.nextInt();
            Integer value = scanner.nextInt();
            drinks.computeIfPresent(key,(k, v) -> v + value);
            drinks.computeIfAbsent(key,(k) -> value);
        }
        drinks.entrySet().stream().sorted((m1, m2) -> {
            return m1.getValue().compareTo(m2.getValue());
        });
        long ans = 0;

        for(int k : drinks.keySet()){
            int buy = Integer.min(M, drinks.get(k));

            ans +=(long) buy * drinks.get(k);
            M -= buy;
        }
        System.out.println(ans);
    }
}