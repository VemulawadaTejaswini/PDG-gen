import java.util.*;


public class Main{

    static long gcd(long a,long b){
        if(a<b){
            long tmp=a;
            a=b;
            b=tmp;
        }
        if(a%b==0)return b;
        else return gcd(b,a%b);
    }

   public static void main(String[] args){
       Scanner sc =new Scanner(System.in);
       long n,x,a;
       n=sc.nextInt();
       x=sc.nextInt();
       long ans=0;
       for(long i=0;i<n;i++){
           a=sc.nextInt();
           if(i==0)ans=(long)Math.abs(a-x);
           else ans=(long)gcd(ans,Math.abs(a-x));
       }
       System.out.println(ans);
   }
}