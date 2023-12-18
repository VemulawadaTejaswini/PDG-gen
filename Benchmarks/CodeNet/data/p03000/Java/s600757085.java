import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int [] list = new int [n];
		int axis = 0;
		int ans = 0;

		for(int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}

		for(int i:list) {
			if(axis <= x) {
				ans += 1;
			}
			axis += i;
		}
		System.out.println(ans);
	}
}
