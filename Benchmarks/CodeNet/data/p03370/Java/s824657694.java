import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int m[] = new int[N];
		for(int i = 0;i < N;i++) {
			m[i] = sc.nextInt();
			X = X - m[i];
		}
		int min;
		for(int i = 0;i < N;i++) {
			for(int j = 1;j < N;j++) {
				if(m[i] > m[j]) {
					min = m[i];
					m[i] = m[j];
					m[j] = min;
				}
			}
		}
		X = X/m[0];
		System.out.println(X + N);
		sc.close();
	}
}