import java.util.Arrays;
import java.util.Scanner;
public class Main {
	int T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main tr = new Main();
		tr.test(sc);
		sc.close();
	}

	void test(Scanner sc){
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int n[] = new int[N];
		int m[] = new int[M];
		for (int i = 0; i < N; i++) {
			n[i] = sc.nextInt();	
		}
		for (int i = 0; i < M; i++) {
			m[i] = sc.nextInt();	
		}
		Arrays.sort(n);
		Arrays.sort(m);
		if(X<Y && n[N-1]<m[0] && X<m[0]){
			System.out.println("No War");
		}else{
			System.out.println("War");
		}
	}
}
