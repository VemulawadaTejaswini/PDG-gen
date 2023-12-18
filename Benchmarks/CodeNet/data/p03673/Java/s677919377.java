import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        String[] a=new String[n+1];
        a[0]="";
        for (int i = 1; i <= n; i++) {
            a[i]=sc.next();
        }
        if(n%2==1){
            for (int i = 0; i <= (n-1)/2; i++) {
                out.print(a[n-2*i]+" ");
            }
            for (int i = 1; i <= (n-1)/2; i++) {
                out.print(a[2*i]);
                if(i!=(n-1)/2)out.print(" ");
            }
            out.println();
        }else{
            for (int i = 0; i <= (n-2)/2; i++) {
                out.print(a[n-i*2]+" ");
            }
            for (int i = 0; i <= (n-2)/2; i++) {
                out.print(a[1+i*2]);
                if(i!=(n-2)/2)out.print(" ");
            }
            out.println();
        }
    }
}