//AddSubMul.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum[]=new int[3];
        sum[0]=a+b;
        sum[1]=a-b;
        sum[2]=a*b;
        System.out.println(Math.max(Math.max(sum[0],sum[1]),sum[2]));
        sc.close();
    }
}