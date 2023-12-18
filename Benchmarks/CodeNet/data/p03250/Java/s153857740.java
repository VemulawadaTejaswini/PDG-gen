import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] x=new int[3];
        x[0]=a*10+b+c;
        x[1]=a+10*b+c;
        x[2]=a+b+10*c;
        Arrays.sort(x);
        out.println(x[2]);
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