import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt(),k=sc.nextInt();
        int a=sc.nextInt();
        int g=0;
        boolean f=false;
        if(a==k)f=true;
        for (int i = 0; i < n - 1; i++) {
            int b=sc.nextInt();
            if(b==k)f=true;
            g=gcd(a,b);
            a=b;
        }
        if(g==1||f||g==k)out.println("POSSIBLE");
        else out.println("IMPOSSIBLE");
    }
    static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}