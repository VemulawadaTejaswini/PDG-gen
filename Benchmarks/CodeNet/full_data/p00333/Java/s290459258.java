import java.util.*;

class Main{
    public static int gcd(int m,int n){
        int r;
        while(n>0){
            r=m%n;
            m=n;
            n=r;
        }
        return m;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int w,h,c;
        w=sc.nextInt();
        h=sc.nextInt();
        c=sc.nextInt();
        int r=gcd(w,h);
        System.out.println((w/r)*(h/r)*c);
    }
}
