import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int[] dif = new int[n];
        for(int i = 0; i < n; i++){
            dif[i] = Math.abs(sum - a[i]*n);
        }
        int ans = 0;
        for(int i = 1; i < n; i++){
            if(dif[i-1] > dif[i]){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
