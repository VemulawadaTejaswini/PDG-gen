import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long f=n/3;
        long sum=0;
        sum+=((f)*(6+(f-1)*3))/2;
        long b=n/5;
        sum+=((b)*(10+(b-1)*5))/2;
        long total=(n*(n+1))/2;
        long fb=n/15;
        sum-=((fb)*(30+(fb-1)*15))/2;
        System.out.println(total-sum);
    }
}
