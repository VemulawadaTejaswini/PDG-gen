import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int count = map.getOrDefault(a, 0);
            map.put(a, ++count);
        }
        
        int count = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 !=0) {
                count++;
            }
        }
        System.out.println(count);
    }
}