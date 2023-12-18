import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][3];
        
        int max_i0 = 0;
        int max_i1 = 0;
        int max_idx = -1;
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
            array[i][2] = i;
            
            if (array[i][0] > max_i0) {
                max_i0 = array[i][0];
                max_i1 = array[i][1];
                max_idx = i;
            }
        }
        
        Arrays.sort(array, (a, b) -> Integer.compare(b[1], a[1]));
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i][2] == max_idx) {
                continue;
            } else if (array[i][1] > max_i0) {
                m -= array[i][1];
                count++;
            } else {
                break;
            }
        }
        
        if (max_i1 > max_i0) {
            m -= max_i1;
            count++;
        }
        count += (m+max_i0-1) / max_i0;
        System.out.println(count);
    }
}
