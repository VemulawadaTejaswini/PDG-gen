import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n+1];
        p[0]=0;
        for (int i=1;i<=n;i++)p[i]=p[i-1]+1+sc.nextInt();
        int ans = 0;
        for (int i=k;i<=n;i++){
            ans = Math.max(ans,p[i]-p[i-k]);
        }
        System.out.println(ans/2d);
    }
}
