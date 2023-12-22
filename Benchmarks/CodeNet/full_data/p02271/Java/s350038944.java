import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ALDS1_5_A();
	}
	public static void ALDS1_5_A() {
		class search{
			int[] A;
			boolean result = false;
			search(int[] A){
				this.A = A;
			}
			public boolean es(int a, int b) {
				if(b == 0) {
					return true;
				}else if(a < 0 || b < 0) {
					return false;
				}
				result = es(a - 1, b - A[a]) || es(a - 1, b);
				return result;
				
			}
		}
		Scanner sc = new Scanner(System.in);
		StringBuilder ans = new StringBuilder();
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < n; i++)
			A[i] = sc.nextInt();
		int q = sc.nextInt();
		int[] m = new int[q];
		for(int i = 0; i < q; i++) {
			m[i] = sc.nextInt();
			search sh = new search(A);
			if(sh.es(n - 1, m[i])) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}

