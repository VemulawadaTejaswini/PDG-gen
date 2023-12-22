import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        Map<Long, Long> valToKey = new HashMap<>();
        Map<Long, Long> keyToVal = new HashMap<>();
        for (long i = 0; i <= 10_000; i++) {
            keyToVal.put(i, i * i * i * i * i);
            valToKey.put(i * i * i * i * i, i);
        }
        for (long i = 0; i <= 10_000; i++) {
            // A +, B +
            if (valToKey.containsKey(keyToVal.get(i) - x)) {
                StringJoiner sj = new StringJoiner(" ");
                sj.add(String.valueOf(i));
                sj.add(String.valueOf(valToKey.get(x - keyToVal.get(i))));
                System.out.println(sj);
                return;
            }
            // A +, B -
            if (valToKey.containsKey(x - keyToVal.get(i))) {
                StringJoiner sj = new StringJoiner(" ");
                sj.add(String.valueOf(i));
                sj.add(String.valueOf(valToKey.get(x - keyToVal.get(i)) * -1));
                System.out.println(sj);
                return;
            }
            // A -, B -
            if (valToKey.containsKey(x + keyToVal.get(i))) {
                StringJoiner sj = new StringJoiner(" ");
                sj.add(String.valueOf(i * -1));
                sj.add(String.valueOf(valToKey.get(x - keyToVal.get(i)) * -1));
                System.out.println(sj);
                return;
            }
        }
    }

}
