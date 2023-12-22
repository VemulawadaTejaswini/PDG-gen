import java.util.Arrays;
import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i < 5;i++)a[i] = Integer.parseInt(scan.next());
		Arrays.sort(a);
		System.out.print(a[4]);
		for(int i = 3;i >= 0;i--){
			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.exit(0);
	}

}