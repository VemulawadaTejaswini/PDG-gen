import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        long ans=0;
        for (int i = n-1; i > 0; i--) {
            if(b[i]!=1)ans+=b[i]-a[i]%b[i];
            a[i-1]+=ans;
        }
        if(b[0]!=1)ans+=b[0]-a[0]%b[0];
        out.println(ans);
    }
}