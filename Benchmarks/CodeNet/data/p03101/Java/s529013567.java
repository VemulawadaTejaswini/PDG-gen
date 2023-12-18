import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong(), M = scanner.nextLong();
        Map<Long, Long> drinks = new HashMap<>();
        for(int i = 0; i < N; i++){
            Long key = scanner.nextLong();
            Long value = scanner.nextLong();
            drinks.computeIfPresent(key,(k, v) -> v + value);
            drinks.computeIfAbsent(key,(k) -> value);
        }
        drinks.entrySet().stream().sorted((m1, m2) -> {
            return m1.getValue().compareTo(m2.getValue());
        });
        long num = 0;
        long yosan = 0;
        for( long key : drinks.keySet()){
            if((M - num) > drinks.get(key)) {
                num += drinks.get(key);
                yosan += key * drinks.get(key);
            }else{
                yosan += key * (M - num);
                break;
            }
        }
        System.out.println(yosan);
    }
}
