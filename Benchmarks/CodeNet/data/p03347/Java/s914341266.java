import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        if (array[0] != 0) {
            System.out.println(-1);
            return;
        }
        
        long count = 0;
        int[] array2 = new int[n];
        int i = n - 1;
        while (i >= 0) {
            int num = array[i];
            if (num > i) {
                System.out.println(-1);
                return;
            }
            
            if (num == 0 || array2[i] == array[i]) {
                i--;
            } else {
                int tmp = num;
                count += tmp;
                
                for (int j = i; j > i - num; j--) {
                    array2[j] = tmp;
                    tmp--;
                }
                
                i--;
            }
        }
        
        System.out.println(count);
    }
}
