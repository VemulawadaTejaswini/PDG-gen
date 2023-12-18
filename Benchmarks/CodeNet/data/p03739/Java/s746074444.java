import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str_a = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str_a[i]);
        }
        
        long sum = 0;
        long count = 0;
        
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (i % 2 == 1) {
                if (sum >= 0) {
                    count += sum + 1;
                    sum = -1;
                }
            }
            else {
                if (sum <= 0) {
                    count += 1 - sum;
                    sum = 1;
                }
            }
        }
        
        long count2 = 0;
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (i % 2 == 0) {
                if (sum >= 0) {
                    count2 += sum + 1;
                    sum = -1;
                }
            }
            else {
                if (sum <= 0) {
                    count2 += 1 - sum;
                    sum = 1;
                }
            }
        }
        System.out.println(count>=count2?count2:count);
    }
}
