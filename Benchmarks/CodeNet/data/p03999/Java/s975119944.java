import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
long ans=0;
//入力
String s = sc.next();
//String Builderを用意
StringBuilder sb = new StringBuilder();
//n=文字列長
int n=s.length();
//文字間と末尾に+を挿入→後で消していき計算式として処理
String t="";
for (int i = 0; i < n; i++) {
    t+=Character.toString(s.charAt(i))+"+";
}

for (int i = 0; i < 1<<(n-1); i++) {
sb.append(t);
for (int j = 0; j < n-1; j++) {
    if((1 & i>>j)==1){
        sb.setCharAt(2*j+1, '-');
    }
}

String q=sb.toString();
q=q.replaceAll("-", "");

String temp="";
for (int j = 0; j < q.length(); j++) {
    if(q.charAt(j)=='+'){
        ans+=Long.parseLong(temp);
        temp="";
    }else{
        temp+=Character.toString(q.charAt(j));
    }
}
sb.delete(0, sb.length());
}
out.println(ans);
/*
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
    return fact(a)/(fact(b)*fact(a-b));
}
*/
}
}