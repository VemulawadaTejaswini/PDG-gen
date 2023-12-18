import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;++i)
			a[i] = sc.nextInt()-1;
		sc.close();
		
		int ans = 0;
		int current = 0;
		while(ans < N) {
			ans++;
			if(a[current] == 1)
				break;
			else
				current = a[current];
		}
		if(ans < N)
			System.out.println(ans);
		else
			System.out.println("-1");
	}
}
