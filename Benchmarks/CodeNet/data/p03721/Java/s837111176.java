import java.util.*;
import java.awt.*;
import java.math.BigInteger;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long[] c=new long[100001];
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            c[a]+=b;
        }
        long temp=0;
        for (int i = 0; i < 100001; i++) {
            temp+=c[i];
            if(temp>=k){
                out.println(i);
                break;
            }
        }
    }
}