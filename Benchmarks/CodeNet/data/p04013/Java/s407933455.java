import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int[] x=new int[n];
        long ans=0;
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt()-a;
        }
        for (int i = 1; i < (1<<n); i++) {
            int temp=0;
            for (int j = 0; j < n; j++) {
                if((1&(i>>j))==1){
                    temp+=x[j];
                }
            }
            if(temp==0)ans++;
        }
        out.println(ans);
    }
}