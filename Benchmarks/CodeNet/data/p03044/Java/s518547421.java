
import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> odd = new HashMap<>();
        
        int n = sc.nextInt();
        int[] color = new int[n];
        Arrays.fill(color, -1);
        
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            if (w % 2 == 1) {
                odd.put(u, v);
            }
        }
        for (int i = 0; i < n; i++) {
            if (odd.containsKey(i)) {
                int val = odd.get(i);
                if (color[val] == -1) {
                    if (color[i] == 0) {
                        color[val] = 1;
                    } else {
                        color[val] = 0;
                        color[i] = 1;
                    }
                }
            }
            if (color[i] == -1) {
                color[i] = 0;
            }
            System.out.println(color[i]);
        }
    }
}