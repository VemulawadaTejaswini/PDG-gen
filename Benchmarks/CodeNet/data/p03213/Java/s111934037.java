import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Map<Integer, Integer> primeMap = new HashMap<>();
        for (int i = 2; i <= N; i++) {
            Map<Integer, Integer> tempMap = getPrimeMap(i);
            for (Map.Entry<Integer, Integer> e : tempMap.entrySet()) {
                if (primeMap.containsKey(e.getKey())) {
                    int temp = primeMap.get(e.getKey());
                    primeMap.put(e.getKey(), temp + e.getValue());
                } else {
                    primeMap.put(e.getKey(), e.getValue());
                }
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        int n3 = 0;
        int n5 = 0;
        for (Map.Entry<Integer, Integer> e : primeMap.entrySet()) {
            if (e.getValue() > 1) {
                if (e.getValue() >= 4) {
                    map.put(e.getKey(), 5);
                    n5++;
                } else {
                    map.put(e.getKey(), 3);
                    n3++;
                }
            }
        }

//        map.forEach((a, b) -> System.out.println(a + " -> " + b));
        int temp = n3 * n5 * (n5-1) / 2;
        if (temp == 1) {
            System.out.println(temp);
        } else {
            if (n5 >= 4) {
                int temp2 = n5;
                int temp3 = (n5-1) * (n5-2) / 2;
//                System.out.println(temp);
//                System.out.println(temp2);
//                System.out.println(temp3);
                System.out.println(temp + temp2 * temp3);
            } else {
                System.out.println(temp);
            }
        }
    }

    static Map<Integer, Integer> getPrimeMap(int n) {
        int i = 2;
        int tmp = n;

        Map<Integer, Integer> primeMap = new HashMap<>();
        while (i * i <= n) {
            if (tmp % i == 0) {
                tmp /= i;
                int a = 0;
                if (primeMap.containsKey(i)) {
                    a = primeMap.get(i);
                }
                primeMap.put(i, a+1);
            } else {
                i++;
            }
        }
        if (tmp != 1) {
            int a = 0;
            if (primeMap.containsKey(i)) {
                a = primeMap.get(tmp);
            }
            primeMap.put(tmp, a+1);
        }

        return primeMap;
    }
    
}
