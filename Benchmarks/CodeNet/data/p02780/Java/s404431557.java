import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
       int n=sc.nextInt();
       int m=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
       double max=0;
       for(int i=0;i<=n-m;i++){
           double now=0;
           for(int j=i;j<i+m;j++)
               now+=(a[j]+1)*1.0/2;
           if(now>max)
               max=now;
       }
        System.out.println(String.format("%.12f",max));


    }
}
