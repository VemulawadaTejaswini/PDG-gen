import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int x = 0;
        for(int i=0; i<n; i++){
            int t = sc.nextInt();
            a[i] = t;
            x += t;
        }
        
        if(x < k){
            System.out.println(n);
            return;
        }
        
        Arrays.sort(a);
        
        boolean[] f = new boolean[n];
        int y = 0;
        for(int i=0; i<n; i++){
            int z = x - y;
            y += a[n-i-1];
            for(int j=0; j<n-i; j++){
                z -= a[j];
                if(j == 0 && z < k) break;
                if(z < k){
                    f[j] = true;
                }
            }
        }
        
        int ans = 0;
        for(int i=0; i<n; i++){
            if(!f[i]) ans++;
        }
        System.out.println(ans);
    }
}
