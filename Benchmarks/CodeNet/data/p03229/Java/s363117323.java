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
            long max1 = Math.max(a[n/2 - 1] - a[0], a[n-1] - a[n/2 - 1]);
            long max2 = Math.max(a[n/2] - a[0], a[n-1] - a[n/2]);
            long max = Math.max(max1, max2);
            if(max == a[n/2 - 1] - a[0]){
                a[n/2 - 1] = 0;
                Arrays.sort(a);
                ans += max;
                while(x < y){
                    ans += a[y] - a[x];
                    x++;
                    ans += a[y] - a[x];
                    y--;
                }
            }else if(max == a[n/2] - a[0]){
                a[n/2] = 0;
                Arrays.sort(a);
                ans += max;
                while(x < y){
                    ans += a[y] - a[x];
                    x++;
                    ans += a[y] - a[x];
                    y--;
                }
            }else if(max == a[n-1] - a[n/2 - 1]){
                a[n/2 - 1] = 0;
                Arrays.sort(a);
                ans += max;
                while(x < y){
                    ans += a[y] - a[x];
                    y--;
                    ans += a[y] - a[x];
                    x++;
                }
            }else{
                a[n/2] = 0;
                Arrays.sort(a);
                ans += max;
                while(x < y){
                    ans += a[y] - a[x];
                    y--;
                    ans += a[y] - a[x];
                    x++;
                }
            }
        }else{
            long max3 = Math.max(a[n/2] - a[0], a[n-1] - a[n/2]);
            a[n/2] = 0;
            Arrays.sort(a);
            ans += max3;
            if(max3 == a[n/2] - a[0]){
                while(x < y){
                    ans += a[y] - a[x];
                    x++;
                    ans += a[y] - a[x];
                    y--;
                }
            }else{
                while(x < y){
                    ans += a[y] - a[x];
                    y--;
                    ans += a[y] - a[x];
                    x++;
                }
            }
        }
        System.out.println(ans);
    }
}
