import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		
		for(int i = 0; i < N; i++) {
			s[i] = sc.next();
		}
		
		int M = sc.nextInt();
		String[] t = new String[M];
		
		for(int i = 0; i < M; i++) {
			t[i] = sc.next();
		}
		
		int temp = 0;
		int money = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(s[i].equals(s[j])) {
					temp++;
				}
			}
			for(int j = 0; j < M; j++) {
				if(s[i].equals(t[j])) {
					temp--;
				}
			}
			money = Math.max(money, temp);
			temp = 0;
		}
		System.out.println(money);
	}
}
