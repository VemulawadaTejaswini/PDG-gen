import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        String[] a=new String[n+1];
        for (int i = 1; i <= n; i++) {
            a[i]=sc.next();
        }
        String ans=a[1];
        if(n%2==0){
            for (int i = 2; i <= n; i++) {
                if(i%2==0){
                    ans=a[i]+" "+ans;
                }else{
                    ans=ans+" "+a[i];
                }
            }
        }else{
            for (int i = 2; i <= n; i++) {
                if(i%2==0){
                    ans=ans+" "+a[i];
                }else{
                    ans=a[i]+" "+ans;
                }
            }
        }
        out.println(ans);
    }
}