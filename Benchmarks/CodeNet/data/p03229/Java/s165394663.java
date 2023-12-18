import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long ans = 0;
        int x = 1; 
        int y = n-1;
        if(n%2 == 0){
            
            long max = Math.max(a[n/2] - a[0], a[n-1] - a[n/2 - 1]);
            if(max == a[n/2] - a[0]){
                a[n/2] = 0;
                Arrays.sort(a);
                ans = max;
                while(x < y){
                    ans += a[y] - a[x];
                    x++;
                    if(x < y){
                        ans += a[y] - a[x];
                        y--;
                    }
                }
            }else{
                a[n/2 - 1] = 0;
                Arrays.sort(a);
                ans = max;
                while(x < y){
                    ans += a[y] - a[x];
                    y--;
                    if(x < y){
                        ans += a[y] - a[x];
                        x++;
                    }
                }
            }
        }else{
            long max3 = Math.max(a[n/2] - a[0], a[n-1] - a[n/2]);
            ans = max3;
            if(max3 == a[n/2] - a[0]){
                a[n/2] = 0;
                Arrays.sort(a);
                while(x < y){
                    ans += a[y] - a[x];
                    x++;
                    if(x < y){
                        ans += a[y] - a[x];
                        y--;
                    }
                }
            }else{
                a[n/2] = 0;
                Arrays.sort(a);
                while(x < y){
                    ans += a[y] - a[x];
                    y--;
                    if(x < y){
                        ans += a[y] - a[x];
                        x++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
