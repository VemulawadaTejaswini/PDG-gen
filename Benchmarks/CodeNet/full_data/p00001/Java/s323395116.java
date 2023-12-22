import java.util.Arrays;
import java.util.Scanner;

public class A0001 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h[] = new int[10];
		for(int i=0;i<10;i++)h[i] = s.nextInt();
		Arrays.sort(h);
		System.out.println(h[9]);
		System.out.println(h[8]);
		System.out.println(h[7]);
	}
}