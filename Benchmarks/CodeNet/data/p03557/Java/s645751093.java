import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int[] b=new int[n];
        for (int i = 0; i < n; i++) {
            b[i]=sc.nextInt();
        }
        int[] c=new int[n];
        for (int i = 0; i < n; i++) {
            c[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long ans=0;
        long ai=0,ci=0;
        for (int i = 0; i < n; i++) {
            while(b[i]>a[(int)ai]){
                ai++;
                if(ai==n)break;
            }
            while(b[i]>=c[(int)ci]){
                ci++;
                if(ci==n)break;
            }
            ans+=ai*(n-ci);
        }
        out.println(ans);
    }
}