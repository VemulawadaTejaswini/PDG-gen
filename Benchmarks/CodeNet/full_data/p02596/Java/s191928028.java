import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = -1;
		if(N == 1 | N == 7)
			ans = 1;
		else if(N % 2 != 0 && N % 5 != 0) {
			long x = 7 % N, y = 7 % N;
			for(int i = 1; i < N; i++) {
				x = x * 10 % N;
				y = (y + x) % N;
				if (y == 0) {
					ans = i + 1;
					break;
				}
			}
		}
		System.out.println(ans);
	}

}