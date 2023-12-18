import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int total=a*(-1)+b;
		
		if(x<total) System.out.println("dangerous");
		else if(total<=0) System.out.println("delicious");
		else System.out.println("safe");
	}
} 