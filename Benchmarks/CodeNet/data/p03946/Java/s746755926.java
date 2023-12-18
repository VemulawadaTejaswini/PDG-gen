import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int max = a[n-1];
        for(int i = n-1 ; i >= 0 ; i--){
            int tmp = a[i];
            a[i] = max - a[i];
            max = Math.max(max, tmp);
        }
        Arrays.sort(a);
        int num = a[n-1];
        int ans = 0;
        for(int i = n-1; i >= 0 && a[i] == num ; i--){
            ans++;
        }

        System.out.println(ans);
    }
}
