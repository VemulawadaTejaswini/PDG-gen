import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static long gcd(long p,long q){
        if(q==0)
            return p;
        long r=p%q;
        return gcd(q,r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int m=sc.nextInt();
        long n=sc.nextLong();
        int a[]=new int[m+1];
        long all=1;
        for(int i=0;i<m;i++) {
            a[i] = sc.nextInt();
            all = all*a[i]/Main.gcd(all, a[i]);
        }
        all=all*a[m-1]/Main.gcd(all, a[m-1]);
        int flag=0;
        for(int i=0;i<m;i++){
            if(all/a[i]%2==0) {
                System.out.print("0");
                break;
            }else
                flag++;
        }
        if(flag==m)
            System.out.print((2*n/all+1)/2);
    }
}
