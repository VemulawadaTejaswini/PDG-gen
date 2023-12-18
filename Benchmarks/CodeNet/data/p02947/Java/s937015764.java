import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int[] ascii = new int[128];
            for (Character c : str.toCharArray()) {
                ascii[c]++;
            }
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < ascii.length; k++) {
                sb.append(k);
                sb.append("#");
                sb.append(ascii[k]);
            }
            String key = sb.toString();

            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
        sc.close();

        long count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (entry.getValue() >= 2 ) {
                // todo calc combination
                count += combi(value);
            }
        }

        System.out.print(count);
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    private static int combi(int n) {
        return factorial(n) / 2;
    }
}
