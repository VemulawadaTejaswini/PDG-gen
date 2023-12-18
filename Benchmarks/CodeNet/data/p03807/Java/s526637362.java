import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str_as = br.readLine().split(" ");
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = Integer.parseInt(str_as[i]);
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (as[i] % 2 == 1) count++;
        }
        
        System.out.println(count%2==0?"YES":"NO");
    }
}
