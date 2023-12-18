import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];

		for(int i=0;i<x.length;i++) {
			x[i] = sc.nextInt();
		}

		Arrays.sort(x);
		System.out.println(x[x.length-1]+" "+x[x.length/2]);

	}
}