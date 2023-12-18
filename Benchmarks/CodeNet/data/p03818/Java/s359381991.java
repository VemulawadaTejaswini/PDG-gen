import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        int even = 0;
        for (int v : map.values()) {
            if (v%2 == 0) {
                even++;
            }
        }

        System.out.println(even%2 == 0 ? map.size() : map.size()-1);
    }
}

