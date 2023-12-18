import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int mid = N / 2;
		int a = 1;
		int b = N;
		for (int i = 1; i < M/2+1; i++) {
			System.out.println((mid-i)+" "+(mid+i));
			System.out.println(a+" "+b);
			a++;
			b--;
		}
		if (M % 2 == 1) {
			System.out.println(a+" "+b);
		}
	}
}