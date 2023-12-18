import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0; int[] v = new int[n]; int[] c = new int[n];
		for(int i = 0; i < n; i++) v[i] = Integer.parseInt(sc.next());
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			if(a < v[i]) sum += v[i] - a;
		}
		System.out.println(sum);
		sc.close();
	}
}