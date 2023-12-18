import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> m = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            m.put(sc.nextInt(), i);
        }

        StringBuilder sb = new StringBuilder();
        for (Entry<Integer, Integer> ent : m.entrySet()) {
            sb.append(ent.getValue());
            sb.append(" ");
        }

        sb.append("\n");
        System.out.println(sb.toString());
    }
}
