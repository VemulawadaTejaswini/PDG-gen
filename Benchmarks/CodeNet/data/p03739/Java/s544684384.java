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
        
        int sum = 0;
        int count = 0;
        sum += a[0];
        if (sum == 0) {
            a[0]++;
            sum++;
            count++;
        }
        
        for (int i = 1; i < n; i++) {
            sum += a[i];
            if (i % 2 == (a[0]>0?1:0)) {
                while (sum >= 0) {
                    a[i]--;
                    sum--;
                    count++;
                }
            }
            else {
                while (sum <= 0) {
                    a[i]++;
                    sum++;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
