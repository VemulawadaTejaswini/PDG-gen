import java.util.*;
import java.io.*;

class Main
{

	

	private static void exhaustiveSearch(int[] a, boolean[] memo, int currentIndex, int sum) {

		memo[sum] = true;

		if (currentIndex >= a.length) 
			return;

		exhaustiveSearch(a, memo, currentIndex + 1, sum);
		exhaustiveSearch(a, memo, currentIndex + 1, sum + a[currentIndex]);
	}


	public static void main(String[] args) {
		try(Scanner reader = new Scanner(new InputStreamReader(System.in)))
		{

			boolean[] memo = new boolean[2001];
			for (int i = 0; i < memo.length; i++) 
				memo[i] = false;

			int n = reader.nextInt();
			reader.nextLine();
			int[] a = new int[n];

			for (int i = 0; i < a.length; i++) {
				a[i] = reader.nextInt();
			}

			Main.exhaustiveSearch(a, memo, 0, 0);

			reader.nextLine();
			
			int q = reader.nextInt();

			for (int i = 0; i < q; i++) 
				System.out.println(memo[reader.nextInt()] ? "yes" : "no");
			


		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}