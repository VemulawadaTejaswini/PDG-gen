import java.util.*;

public class Main {
    static int INF = 1001001009;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int left = 0;
        int right = 1001001009;
        
        while (left < right) {
            int center = (left + right) / 2;
            
            // System.out.println(left + " " + right);
            // System.out.println(center);
            boolean ok = false;
            
            // okがどうかの判定
            long count = 0;
            for (int i = 0; i < n; i++) {
                double tmp = (double)array[i];
                
                int tmpcount = (center + array[i] -1) / center;
                
                // int tmpcount = 1;
                // while ((double)array[i] / tmpcount > (double)center) {
                //     tmpcount++;
                // }
                tmpcount--;
                
                count += tmpcount;
                
            }
            
            // if (center == 265890893) {
            //     System.out.println(count);
            // }
            
            if (count <= k) ok = true;
            
            if (ok) {
                right = center;
            } else {
                left = center + 1;
            }
        }
        
        System.out.println(left);
    }
}