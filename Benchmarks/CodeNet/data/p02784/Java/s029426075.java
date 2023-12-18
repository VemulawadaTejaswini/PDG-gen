import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long h = scan.nextLong();
		int n = scan.nextInt();

		long sum = 0;
		int i;
		for(i = 0; i < n; i++)
			sum += scan.nextLong();

		if(sum >= h)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}