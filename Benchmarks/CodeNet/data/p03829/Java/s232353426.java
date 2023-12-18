import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        long a=sc.nextInt(),b=sc.nextInt();
        int[] x=new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt();
        }
        long ans=0;
        for (int i = 0; i < n-1; i++) {
            long d=x[i+1]-x[i];
            ans+=min(d*a,b);
        }
        out.println(ans);
    }
}