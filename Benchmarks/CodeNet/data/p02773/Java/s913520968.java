import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> cnt = new TreeMap<>();
        int N = scan.nextInt();
        int up = 0;
        for (int i = 0; i < N; i++) {
            String temp = scan.next();
            cnt.merge(temp, 1, Integer::sum);
            up = Math.max(cnt.get(temp), up);
        }
        int finalUp = up;
        cnt.forEach((a, b) -> {
            if (b == finalUp) System.out.println(a);
        });
    }
}