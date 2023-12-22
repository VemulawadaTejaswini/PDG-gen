import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner scan = new Scanner(System.in);

		int[] a = new int[10];
		for(int i=0;i<10;i++)
			a[i]=scan.nextInt();
		Arrays.sort(a);
		for(int i=9;i>=7;i--)
			System.out.println(a[i]);
	}

}