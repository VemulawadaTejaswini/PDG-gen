import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long res1 = gcd(a, b);
            long res2 = a/res1*b;
            System.out.println(res1+" "+res2);
        }
    }
    public static long gcd(long a, long b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
}
