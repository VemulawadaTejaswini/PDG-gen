import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] d = new int[n];
		for(int i=0;i<n;i++) d[i] = in.nextInt();
		Arrays.sort(d);
		int l = d[n/2-1];
		int u = d[n/2];
		System.out.println(u-l);
		in.close();

	}

}
