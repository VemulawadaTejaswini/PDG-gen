//SqrtInequality.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();

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