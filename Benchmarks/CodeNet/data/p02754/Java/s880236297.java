import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long a=sc.nextInt();
        long b=sc.nextInt();
        long ans=0;
        while(n>0)
        {
            ans+=Math.min(a,n);
            n-=Math.min(a,n);
            n-=Math.min(b,n);
        }
       System.out.println(ans);
    }
}