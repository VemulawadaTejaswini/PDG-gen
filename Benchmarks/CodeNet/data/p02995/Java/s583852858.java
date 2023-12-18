import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long a=Long.parseLong(sc.next());
        long b=Long.parseLong(sc.next());
        long c=Long.parseLong(sc.next());
        long d=Long.parseLong(sc.next());
        long cd=lcm(c,d);
        long ans=0,x,y;
        x=(a+c-1)/c;
        y=b/c;
        ans+=y-x+1;
        
        x=(a+d-1)/d;
        y=b/d;
        ans+=y-x+1;
        
        x=(a+cd-1)/cd;
        y=b/cd;
        ans-=y-x+1;
        System.out.println(b-a+1-ans);
    }
    public static long gcd(long a,long b){
        if(a<b){
        a^=b^=a;
        b^=a;}
        if(b!=0)
        return gcd(a%b,b);
        else return a;
    }public static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
}
