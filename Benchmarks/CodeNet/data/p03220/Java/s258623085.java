import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        double a = Double.parseDouble(sc.next());
        double minDiff = Integer.MAX_VALUE;
        Map<Integer, Integer> heightMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
        	int x = Integer.parseInt(sc.next());
        	heightMap.put(i,  x);
        }
        int ans = heightMap.entrySet().stream().map(h -> {
        	double ti = t - h.getValue() * 0.006;
        	int ansCandidate = 0;
        	if (Math.abs(a - ti) < minDiff) {
        		ansCandidate = h.getKey();
        		minDiff = Math.abs(a - ti);
        	}
        	return h.getKey();
        }).hashCode();

        System.out.println(ans);
    }
}