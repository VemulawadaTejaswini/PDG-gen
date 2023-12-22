
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[2];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		a[3] = sc.nextInt();
		b[0] = sc.nextInt();
		b[1] = sc.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(a[1]+a[2]+a[3]+b[1]);
	}
}