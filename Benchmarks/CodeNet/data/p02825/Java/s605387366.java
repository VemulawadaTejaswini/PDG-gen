import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N % 3 != 0)
			System.out.println(-1);
		else {
			StringBuilder ans = new StringBuilder();
			char x, y = 'a';
			for(int i = 0; i < N*2/3; i++) {
				x = y;
				for(int j = 0; j < N/3; j++) {
					ans.append(x);
					x++;
					if(x == 123)
						x = 'a';
				}
				for(int j = N/3; j < N; j++)
					ans.append(".");
				ans.append("\n");
				if(i % 2 != 0)
					y++;
				if(y == 123)
					y = 'a';
			}
			y = 'a';
			for(int i = N*2/3; i < N; i++) {
				x = y;
				for(int j = 0; j < N/3; j++)
					ans.append(".");
				for(int j = N/3; j < N; j+=2) {
					ans.append(x);
					ans.append(x);
					x++;
					if(x == 123)
						x = 'a';
				}
				ans.append("\n");
				y++;
				if(y == 123)
					y = 'a';
			}
			System.out.println(ans);
		}

	}

}
