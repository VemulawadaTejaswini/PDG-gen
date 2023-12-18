import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
            sum += array[i];
        }
        
        long left = array[0];
        long right = array[n - 1];
        for (int i = 1; i < n - 1; i++) {
            if (left + array[i] < sum / 2) {
                left += array[i];
            } else {
                right = sum - left;
                break;
            }
        }
        
        System.out.println(Math.abs(right - left));
    }
}
