import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long ans=0;
        int[] b=new int[n+1];
        if(n%2==1){
            int temp=(n+1)/2;
            b[temp]=a[1];
            for (int i = 1; i < temp; i++) {
                if(i%2==1){
                    b[temp+i]=a[n-i+1];
                    b[temp-i]=a[n-i];
                }else{
                    b[temp+i]=a[i];
                    b[temp-i]=a[i+1];
                }
            }
        }else{
            int temp=n/2;
            for (int i = 1; i <= temp; i++) {
                if(i%2==1){
                    b[temp-i+1]=a[i];
                    b[temp+i]=a[n-i+1];
                }else{
                    b[temp-i+1]=a[n-i+1];
                    b[temp+i]=a[i-1];
                }
            }
        }
        for (int i = 1; i < n; i++) {
            ans+=abs(b[i]-b[i+1]);
        }
        out.println(ans);
    }
}