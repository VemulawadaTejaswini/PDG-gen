
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), K = scan.nextInt();
        int tmpa = 0, tmpb = 0;

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            tmpa = scan.nextInt();
            tmpb = scan.nextInt();
            if (map.containsKey(tmpa)) map.put(tmpa, map.get(tmpa) + tmpb);
            else map.put(tmpa, tmpb);
        }

        long val = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            val += entry.getValue();
            if (val >= K){
                System.out.println(entry.getKey());
                return;
            }
        }
    }
}