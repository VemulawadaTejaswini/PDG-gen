import java.util.Scanner;


public class Main {
	
	static int count(int index, int mod, int[] a) {
		if (index == a.length)
			return mod == 0 ? 1: 0;
		int ret = 0;
		for(int i = -1; i <= 1; i++)
			ret += count(index + 1, (mod * (a[index] + i)) % 2, a);
		return ret;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++)
			a[i] = sc.nextInt();
		System.out.println(count(0, 1, a));
		sc.close();
	}

}
