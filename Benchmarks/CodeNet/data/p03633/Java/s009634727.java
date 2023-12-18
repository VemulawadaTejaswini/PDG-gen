import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] t=new int [n];int i,max_GCD;
        for(i=0;i<n;i++){
            t[i]=sc.nextInt();
        }
        System.out.println(max_gcd(t));
    }

    static int gcd(int a,int b){
        int x,tmp,ans,r;
          x = a * b;
           if(a<b){
            tmp = a;
            a = b;
            b = tmp;
            }
            r = a % b;
         while(r!=0){
            a = b;
            b = r;
            r = a % b;
         }
         ans=(int)x/b;
         return ans;
    }
    static int max_gcd(int[] x){
        int i;
        int len=x.length;
        int s=gcd(x[0],x[1]);
        for(i=2;i<len;i++){
            s=gcd(x[i],s);
        }
        return s;
    }
}