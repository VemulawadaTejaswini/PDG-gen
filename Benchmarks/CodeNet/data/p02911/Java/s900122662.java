import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		String Alist[] = new String[N];
		int Nlist[] = new int[N];
		Arrays.fill(Alist, "Yes");
		Arrays.fill(Nlist, K);
		for(int i = 0; i < Q; i++) {
			int a = sc.nextInt();
			for(int j = 0; j < N; j++) {
				if(j != a - 1) {
					Nlist[j]--;
				}
				if(Nlist[j] <= 0) {
					Alist[j] = "No";
				}
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.println(Alist[i]);
		}
	}

}