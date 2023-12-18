import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int val = sc.nextInt();
            if(val <= t) {
                map.put(key, val);
                ans = Math.min(ans, key);
            }
        }
        if(map.size() == 0) {
            System.out.println("TLE");
        } else {
            System.out.println(ans);
        }
    }
}