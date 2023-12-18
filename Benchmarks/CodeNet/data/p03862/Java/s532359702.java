import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
            
        int cnt = 0;
        int diff = Math.max(0, arr[0] - x);
        arr[0] = arr[0] > x ? x : arr[0];
        cnt =  diff;
        for(int i = 0; i < n - 1; i++) {
            diff = arr[i] + arr[i+1] - x;
            if(diff > 0) {
                arr[i+1] -= diff;
                cnt += diff;
            }
        }
        
        System.out.println(cnt);
    }
}
