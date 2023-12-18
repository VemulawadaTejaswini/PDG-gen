import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int sum = 0;
        for(int w:a) sum += w;
        int ans = -1;
        int dif = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int cur = Math.abs(sum-n*a[i]);
            if(cur<dif){
                dif=cur;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}