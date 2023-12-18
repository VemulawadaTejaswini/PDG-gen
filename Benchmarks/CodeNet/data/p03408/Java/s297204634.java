import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hash = new HashMap<String, Integer>();

        int N = sc.nextInt();
        for (int i=0; i<N; i++) {
            String s = sc.next();
            int count = hash.getOrDefault(s, 0);
            count++;
            hash.put(s, count);
        }

        int M = sc.nextInt();
        for (int i=0; i<M; i++) {
            String t = sc.next();
            int count = hash.getOrDefault(t, 0);
            count--;
            hash.put(t, count);
        }

        int max = -1000000000;
        for (int val : hash.values()) {
            max = Math.max(max, val);
        }
        if (max >= 0)
            System.out.println(max);
        else
            System.out.println(0);
    }
}