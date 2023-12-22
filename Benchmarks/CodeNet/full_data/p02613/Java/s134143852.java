import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> m = new HashMap<>();
        m.put("AC", 0);
        m.put("WA", 0);
        m.put("TLE", 0);
        m.put("RE", 0);
        for (int i = 0; i < n; i++) {
            String res = in.next();
            m.put(res, m.get(res) + 1);
        }

        System.out.println("AC x " + m.get("AC"));
        System.out.println("WA x " + m.get("WA"));
        System.out.println("TLE x " + m.get("TLE"));
        System.out.println("RE x " + m.get("RE"));
    }
}