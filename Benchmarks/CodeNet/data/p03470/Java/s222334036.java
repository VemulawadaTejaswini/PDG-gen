import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int size = sc.nextInt();
            if(map.containsKey(size)){
                map.put(size, map.get(size)+1);
            } else {
                map.put(size, 1);
            }
        }
        System.out.println(map.size());
    }
}
