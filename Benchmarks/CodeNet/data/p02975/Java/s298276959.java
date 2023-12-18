import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (map.containsKey(num)) {
                int val = map.get(num);
                map.put(num, val + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        if (n % 3 != 0) {
            System.out.println("No");
            return;
        }
        
        int nu = n / 3;
        int[] array = new int[3];
        int number = 0;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() != nu) {
                System.out.println("No");
                return;
            }
        }
        
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            array[number] = entry.getKey();
            number++;
        }
        
        int ra = array[0] ^ array[1];
        int rb = array[1] ^ array[2];
        int rc = array[0] ^ array[2];
        
        if (ra != array[2]) {
            System.out.println("No");
            return;
        }
        if (rb != array[0]) {
            System.out.println("No");
            return;
        }
        if (rc != array[1]) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
