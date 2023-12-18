import java.util.Scanner;

public class Haiku{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String op=sc.next();

		op=op.replace(","," ");
		
		System.out.println(op);	
	}
	
} 