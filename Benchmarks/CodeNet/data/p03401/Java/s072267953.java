import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] l = new int[N+2];
        long ans = 0;
        for(int i = 1;i <= N;i++){
            l[i] = sc.nextInt();
            ans += Math.abs(l[i]-l[i-1]);
        }
        ans += Math.abs(l[N+1]-l[N]);
        long div = ans;
        for(int i = 1;i <= N;i++){
            ans -= Math.abs(l[i]-l[i-1])+Math.abs(l[i+1]-l[i]);
            ans += Math.abs(l[i+1]-l[i-1]);
            System.out.println(ans);
            ans = div;
        }
    }
}