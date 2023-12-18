import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;++i)
			a[i] = sc.nextInt();
		sc.close();
		
		boolean flag = true;
		int alice = 0, bob = 0;
		Arrays.sort(a);
		for(int i = N-1;i >= 0;--i) {
			if(flag)
				alice += a[i];
			else
				bob += a[i];
			flag = !flag;
		}
		System.out.println(alice-bob);
	}
}
