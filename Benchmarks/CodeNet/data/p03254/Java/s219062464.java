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

        for (int i = 0; i < n; i++) {
            if(x>=a[i]){
                x-=a[i];
                ans++;
            }else{
                break;
            }
        }
        if(ans>0&&x>0)ans--;
        out.println(ans);
    }
}