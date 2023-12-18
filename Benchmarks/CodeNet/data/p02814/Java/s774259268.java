import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt()/2;
        }
        long lcm=1;
        for(int i=0;i<n;i++){
            lcm=lcm*a[i]/gcd(lcm,a[i]);
            if(lcm>m){
                System.out.println(0);return;
            }
        }
        int min=Integer.MAX_VALUE;
        int count;
        for(int i=0;i<n;i++){
            count=0;
            while(a[i]%2==0){
                a[i]/=2;
                count++;
            }
            min=Math.min(count,min);
        }
        if(lcm/(long)Math.pow(2,min)%2==0){
            System.out.println(0);
            return;
        }
        System.out.println(((m/lcm)+1)/2);
 
    }
    static long gcd(long n,long m){
        if(n<m){
            n=n+m;
            m=n-m;
            n=n-m;
        }
        n%=m;
        if(n==0){
            return m;
        }else{
            return gcd(n,m);
        }
    }


}