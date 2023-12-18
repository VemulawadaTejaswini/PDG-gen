import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        String s=sc.next();
        String t=sc.next();
        HashSet<Character> setS=new HashSet<>();
        HashSet<Character> setT=new HashSet<>();
        int loop=s.length();
        int[] x=new int[loop];
        for (int i = 0; i < loop; i++) {
            char p=s.charAt(i);
            char q=t.charAt(i);
            setS.add(p);
            setT.add(q);
            if(setT.size()!=setS.size()){
                out.println("No");
                exit(0);
            }
            if(x[p]==0){
                x[p]=q;
            }else if(x[p]!=q){
                out.println("No");
                exit(0);
            }
            
        }
        out.println("Yes");
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