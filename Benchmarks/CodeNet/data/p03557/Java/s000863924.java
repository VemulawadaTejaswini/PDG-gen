import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] a=new int[n+2];
        a[0]=0;a[n+1]=1000000001;
        int[] b=new int[n];
        int[] c=new int[n+2];
        a[0]=0;c[n+1]=1000000001;
        for (int i = 1; i <= n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i]=sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            c[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long ans=0;
        for (int i = 0; i < n; i++) {
            int l=0,r=n+1;
            int t=b[i];
            int m=(l+r)/2;
            long tempA=0,tempC=0;
            while (true) {
                if(a[m]<t&&t<=a[m+1]){
                    tempA=m;
                    break;
                }else if(a[m]>=t){
                    r=m-1;
                    m=(l+r)/2;
                }else if(a[m]<t){
                    l=m+1;
                    m=(l+r)/2;
                }
            }
            l=0;r=n+1;m=(l+r)/2;
            while (true) {
                if(c[m]<=t&&t<c[m+1]){
                    tempC=n-m;
                    break;
                }else if(c[m]>t){
                    r=m-1;
                    m=(l+r)/2;
                }else if(c[m]<=t){
                    l=m+1;
                    m=(l+r)/2;
                }
            }
            ans+=tempA*tempC;
        }
        out.println(ans);
    }
}