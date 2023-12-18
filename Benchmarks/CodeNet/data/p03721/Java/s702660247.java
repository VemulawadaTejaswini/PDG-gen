import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] num = new int[100010];
		for(int i = 0 ; i < n ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			num[a] += b;
		}
		for(int i = 0 ; i <= 100009 ; i++) {
			k -= num[i];
			if(k <= 0) {
				System.out.println(i);
				return;
			}
		}
	}
}







