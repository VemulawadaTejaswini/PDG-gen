//SqrtInequality.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double sum=Math.sqrt(a)+Math.sqrt(b);
        double ans=Math.sqrt(c);
        if(sum<ans){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }       
        sc.close();
    }
}