import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static final Scanner in = new Scanner(System.in);
	
	private static int[] input(){
		int len = in.nextInt();
		len *= 2;
		int a[] = new int[len];
		for(int i=0; i<len; i++)
		{
			a[i] = in.nextInt();
		}
		return a;
	}
	
	private static int solve(int a[])
	{
		Arrays.sort(a);
		int ingr = 0;
		for(int i=0; i<a.length; i+=2)
		{
			ingr += a[i];
		}
		return ingr;
	}

	public static void main(String[] args) {
		System.out.println(solve(input()));
	}

}
