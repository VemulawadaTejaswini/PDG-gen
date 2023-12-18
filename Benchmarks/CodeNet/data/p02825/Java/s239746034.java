import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N % 3 != 0)
			System.out.println(-1);
		else {
			StringBuilder ans = new StringBuilder();
			for(int i = 0; i < N*2/3; i++) {
				char x = 'a';
				for(int j = 0; j < N/3; j++) {
					ans.append(x);
					x++;
				}
				for(int j = N/3; j < N; j++)
					ans.append(".");
				ans.append("\n");
			}
			for(int i = N*2/3; i < N; i++) {
				char x = 'a';
				for(int j = 0; j < N/3; j++)
					ans.append(".");
				for(int j = N/3; j < N; j+=2) {
					ans.append(x);
					ans.append(x);
					x++;
				}
				ans.append("\n");
			}
			System.out.println(ans);
		}

	}

}