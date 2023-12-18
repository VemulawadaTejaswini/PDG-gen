import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int[] x=new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt();
        }
        int[] y=new int[m];
        for (int i = 0; i < m; i++) {
            y[i]=sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        if(x[n-1]<y[0]&&X<y[0]&&x[n-1]<Y){
            out.println("No War");
        }else{
            out.println("War");
        }
    }
    //階乗
static long fact(long a){
    long b=1;
    for (long i = 1; i <= a; i++) {
        b*=i;
    }
    return b;
}
//最大公約数
static int gcd (int a, int b) {
    int temp;
    while((temp = a%b)!=0) {
        a = b;
        b = temp;
    }
    return b;
}
//※最小公倍数はa*b/gcd(a,b)である
//二項係数
static long combi (long a, long b) {
    b=min(a-b,b);
    return permu(a,b)/fact(b);
}
//順列
static long permu(long a,long b){
    long temp=1;
    for (long i =a ; i > a-b; i--) {
        temp*=i;
    }
    return temp;
}
}