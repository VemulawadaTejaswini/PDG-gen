import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a,b,c;
		a=cin.nextInt();
		b=cin.nextInt();
		c=cin.nextInt();
		if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		cin.close();
	}

}
