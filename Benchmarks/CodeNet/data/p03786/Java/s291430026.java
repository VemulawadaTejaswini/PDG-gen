import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            max = Math.max(max, array[i]);
        }
        
        Arrays.sort(array);
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] * 2 >= max) {
                count++;
            }
        }
        
        
        int index = 99999999;
        for (int i = 0; i < n - count; i++) {
            if (array[i] * 2 < array[i + 1]) {
                
            } else {
                index = i;
            }
            array[i + 1] += array[i];
        }
        
        System.out.println(Math.max(n - index, count));
    }
}