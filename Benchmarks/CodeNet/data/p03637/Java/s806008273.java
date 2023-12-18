import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int a2 = 0;
		int a4 = 0;
		int e = 0;
		for(int i = 0 ; i < n ; i++) {
			if(a[i] % 4 == 0) a4++;
			else if(a[i] % 2 == 0) a2++;
			else e++;
		}
		if(a4 >= n / 2 || a2 == n || a2 % 2 == 0 && e == a4) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
