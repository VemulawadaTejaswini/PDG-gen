import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;


public class Main {
    public static Scanner r=new Scanner(System.in);
    public static void solve(int n,int m){
        int l1=1,r1=n/2;
        int l2=n/2+1,r2=n;
        while(l1<r1&&m>0){
            System.out.println(l1+" "+r1);
            ++l1;
            --r1;
            --m;
        }
        while(l2<r2&&m>0){
            System.out.println(l2+" "+r2);
            ++l2;
            --r2;
            --m;
        }
    }
    public static void main(String[] args) {
        int n=r.nextInt();
        int m=r.nextInt();
        if(n%2==0){
            solve(n-1,m);
        }
        else{
            solve(n,m);
        }
    }
}
