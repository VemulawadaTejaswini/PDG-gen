import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        //PQの先頭要素は最小
        PriorityQueue<Long> left=new PriorityQueue<>();
        PriorityQueue<Long> right=new PriorityQueue<>(Comparator.reverseOrder());
        int n=sc.nextInt();
        long[] a=new long[1+n*3];
        for (int i = 1; i <= 3*n; i++) {
            a[i]=sc.nextLong();
        }
        long[] tL=new long[3*n+1];
        long[] tR=new long[3*n+2];
        for (int i = 1; i <=2*n ; i++) {
            left.add(a[i]);
            if(i<=n)tL[i]+=a[i]+tL[i-1];
            else {
                long y=left.poll();
                tL[i]+=tL[i-1]+a[i]-y;
                //out.println("取り出されたのは"+y);
            }
        }
        for (int i = 3*n; i > n; i--) {
            right.add(a[i]);
            if(i>=2*n+1)tR[i]+=a[i]+tR[i+1];
            else {
                long y=right.poll();
                tR[i]+=tR[i+1]+a[i]-y;
                //out.println("取り出されたのは"+y);
            }
        }
        long ans=Long.MIN_VALUE;
        for (int i = n; i <=n*2 ; i++) {
            ans=max(tL[i]-tR[i+1],ans);
        }
        out.println(ans);
        //out.println();
        //for (long j:tL)out.println(j);
        //out.println();
        //for (long j:tR)out.println(j);
    }
}