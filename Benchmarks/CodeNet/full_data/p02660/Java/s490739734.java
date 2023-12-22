import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.next());
        if (n == 1) {
            System.out.println(0);
            return;
        }
        Map<Long, Long> map = new  HashMap<>();
        for (long i = 2; i <= n;) {
            if (n % i == 0) {
                n /= i;
                if (map.containsKey(i)) {
                    map.replace(i, map.get(i) + 1);
                }else {
                    map.put(i, 1L);
                }
            }else {
                i++;
            }
        }
        AtomicLong count = new AtomicLong();
        map.forEach((k ,v) -> {
            int i = 1;
            while (true) {
                if (v - i >= 0) {
                    count.getAndIncrement();
                    v -= i;
                    i++;
                }else {
                    break;
                }
            }
        });
        System.out.println(count);



    }
}



