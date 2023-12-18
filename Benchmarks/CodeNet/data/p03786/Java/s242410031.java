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
        
        Arrays.sort(array);
        
        int[] cumsum = new int[n];
        cumsum[0] = array[0];
        for (int i = 1; i < n; i++) {
            cumsum[i] += array[i] + cumsum[i - 1];
        }
        
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {
            if (cumsum[i - 1] * 2 < array[i]) {
                count = i;
                break;
            }
        }
        
        System.out.println(n - count);
    }
}
