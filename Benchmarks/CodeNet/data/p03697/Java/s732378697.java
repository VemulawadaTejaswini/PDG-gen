import java.util.Scanner;

public class  Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int total=a+b;
		
		if(total<10) System.out.println(total);
		else System.out.println("error");
	}
} 