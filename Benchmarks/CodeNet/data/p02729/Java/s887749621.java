import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int sum1=0,sum2=0,sum=0;
        a=a-1;b=b-1;
        sum1=(a*(a+1))/2;
        sum2=(b*(b+1))/2;
        sum=sum1+sum2;
        System.out.println(sum);
    }
}