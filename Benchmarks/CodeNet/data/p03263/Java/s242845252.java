import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
//処理
int H=sc.nextInt();
int W=sc.nextInt();
int[][] a=new int[H][W];
for (int i = 0; i < H; i++) {
    for (int j = 0; j < W; j++) {
        a[i][j]=sc.nextInt();
    }
}
String[] s=new String[W*H*2];
int c=0;
for (int i = 0; i < H; i++) {
    for (int j = 0; j < W; j++) {
        if(a[i][j]%2!=0){
            if(i!=H-1){
                s[c+1]=String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+2)+" "+String.valueOf(j+1);
                c++;
                a[i][j]--;
                a[i+1][j]++;
            }else if(j!=W-1){
                s[c+1]=String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+1)+" "+String.valueOf(j+2);
                c++;
                a[i][j]--;
                a[i][j+1]++;
            }
        }
    }
}
s[0]=String.valueOf(c);
for (int j = 0; j <= c; j++) {
    out.println(s[j]);
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