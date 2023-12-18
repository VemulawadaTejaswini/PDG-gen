import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int ans = 0;
        for (int i = 0; i < n - 1; i++){
            if (i % 2 == 1){
                continue;
            }
            int dif = Math.min(arr[i], arr[i + 1]);
            //System.out.println("dif" + dif);
            arr[i] -= dif;
            arr[i + 1] -= dif;
            ans += dif;
            int a = arr[i]/2;
            ans += a;
            //arr[i] -= 2 * a;
            int b = arr[i + 1]/2;
            ans += b;
            //arr[i + 1] -= 2 * b;
            
        }
        System.out.println(ans);
        //System.out.println(Arrays.toString(arr));
    }
}
