import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (n-- > 0) {
            int num = sc.nextInt();
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int v = map.get(num);
                map.put(num, v + 1);
            }
        }
        
        int s = map.size();
        
        int[] array = new int[s];
        int index = 0;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            array[index] = entry.getValue();
            index++;
        }
        
        Arrays.sort(array);
        
        int count = 0;
        for (int i = 0; i < s - k; i++) {
            count += array[i];
        }
        
        System.out.println(count);
    }
}
