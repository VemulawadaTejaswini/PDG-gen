import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int cnt = 0;
		for(int i = 1; i <= N; i++) {
			String n = Integer.toString(i);
			int t = 0;
			for(int j = 0; i < n.length(); j++) {
				t += n.charAt(j) - '0';
			}
			if(t >= A && t <= B) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}