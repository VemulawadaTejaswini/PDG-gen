import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int ans=0;
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long t=0;
        for (int i = 0; i < n; i++) {
            if(t+a[i]<=x){
                ans++;t+=a[i];
            }else{
                break;
            }
        }
        if(t!=x&&ans>0)ans--;
        out.println(ans);
    }
}