
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] h = new long[n];
        for(int i=0;i<n;i++){
            h[i] = sc.nextInt();
        }
        boolean[] noGood = new boolean[n];
        for(int i=0;i<m;i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            if(h[a] <= h[b]){
                noGood[a] = true;
            }
            if(h[a] >= h[b]){
                noGood[b] = true;
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(!noGood[i]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
