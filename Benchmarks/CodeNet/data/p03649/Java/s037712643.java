import java.lang.reflect.Array;
import java.util.*;
import java.awt.geom.Point2D;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        long[] a=new long[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
        }
        long ans=0;
        out.println(calc(a,ans,n));
    }
    static long calc(long[] a,long ans,int n){
        Arrays.sort(a);
        if(a[n-1]<n)return ans;
        ans+=a[n-1]/n;
        a[n-1]=a[n-1]%n;
        for (int i = 0; i <n-1 ; i++) {
            ++a[i];
        }
        return calc(a,ans,n);
    }
}