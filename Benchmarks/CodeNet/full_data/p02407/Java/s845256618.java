import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] a = new int[n];

		int i;

		for(i=0; i<n; i++)
		{
			a[i] = scan.nextInt();
		}

		for(i=n-1; 0<=i; i--)
		{
			if(i == 0) System.out.printf("%d\n", a[i]);
			else System.out.printf("%d ", a[i]);
		}

		scan.close();
	}

}