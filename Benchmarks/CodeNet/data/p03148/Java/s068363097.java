import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] f=new long[k+1];
        Point[] sushi = new Point[n];
        for (int i = 0; i < n; i++) {
            sushi[i]=(new Point(sc.nextInt(), sc.nextInt()));
        }
        HashSet<Integer> S=new HashSet<>();
        Arrays.sort(sushi,(p1, p2) -> p2.y - p1.y);
        long temp=0;
        Point[] high=new Point[k];
        Point[] low=new Point[n-k];
        int[] s=new int[n+1];
        for (int i = 0; i < n; i++) {
            if(i<k){
                high[i]=sushi[i];
                temp+=(long) sushi[i].y;
                S.add(sushi[i].x);
                s[sushi[i].x]++;
            }else low[i-k]=sushi[i];
        }
        int size=S.size();
        f[size]=temp;
        int left=k-1,right=0;
        while (0<=left&&right<n-k){
            int tl=left,tr=right;
            while (right<n-k&&s[low[right].x]>0){
                right++;
            }
            while (0<=left&&s[high[left].x]==1){
                left--;
            }
            if(0<=left&&right<n-k){
                f[size+1]=f[size]-high[left].y+low[right].y;
                size++;
                s[low[right].x]++;
                s[high[left].x]--;
            }
        }
        long ans=0;
        for (long i = 1; i <= k; i++) {
            if(f[(int)i]>0)ans=max(ans,f[(int)i]+i*i);
        }
        out.println(ans);
    }
}