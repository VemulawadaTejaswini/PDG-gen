import java.util.*;
import java.io.*;

class Main
{

	private static boolean exhaustiveSearch(int[] a, int currentIndex, int target, int sum) {

		if (sum == target)
			return true;

		if (currentIndex >= a.length) 
			return false;

		return exhaustiveSearch(a, currentIndex + 1, target, sum) || exhaustiveSearch(a, currentIndex + 1, target, sum + a[currentIndex]);

	}

	public static void main(String[] args) {
		try(Scanner reader = new Scanner(new InputStreamReader(System.in)))
		{
			int n = reader.nextInt();
			reader.nextLine();
			int[] a = new int[n];

			for (int i = 0; i < a.length; i++) {
				a[i] = reader.nextInt();
			}
			reader.nextLine();
			
			int q = reader.nextInt();

			for (int i = 0; i < q; i++) {
				System.out.println(Main.exhaustiveSearch(a, 0, reader.nextInt(), 0) ? "yes" : "no");
			}


		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}