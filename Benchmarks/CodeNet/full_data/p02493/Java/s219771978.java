import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int n;
		int a[];
		int i;
		
		n = stdIn.nextInt();
		a = new int[n];
		for (i = 0; i < n; i++){
			a[i] = stdIn.nextInt();
		}
		for (i = n - 1; i > 0; i--){
			System.out.print(a[i] + " ");
		}
		System.out.println(a[i]);
	}
}