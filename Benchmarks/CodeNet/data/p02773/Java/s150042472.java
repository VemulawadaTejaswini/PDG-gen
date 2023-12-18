import java.util.TreeMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
        int n = Integer.parseInt(stdIn.next());
        String s;
        for (int i = 0; i < n; i++) {
            s = stdIn.next();
            int count = 1;
            if (tm.containsKey(s)) {
                count += tm.get(s);
            }
            tm.put(s, count);
        }

        int maxValue = 0;
        for (int value : tm.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        for (String key : tm.keySet()) {
            if (tm.get(key) == maxValue) {
                System.out.println(key);
            }
        }
    }
}