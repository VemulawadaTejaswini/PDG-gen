import java.util.*;

public class Main {
	
	static int c[][];

	public static boolean judge(int tmpa, int tmpb) {
		int b[] = new int[3];
		int a[] = new int[3];
		a[0] = tmpa;
		b[0] = tmpb;
		for(int i = 1; i < 3; ++i) 
			b[i] = c[0][i] - a[0];
		for(int i = 1; i < 3; ++i) 
			a[i] = c[i][0] - b[0];
		for(int i = 1; i  < 3; ++i) {
			for(int j = 1; j < 3; ++j) {
				int tmp = a[i] + b[j];
				if(c[i][j] != tmp)return false;
			}
		}
		return true;
	}
	
	public static boolean solve() {
		for(int i = 0; i <= c[0][0]; ++i) {
			if(judge(i, c[0][0] - i))return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		c = new int[3][3];
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) 
				c[i][j] = sc.nextInt();
		}
		sc.close();
		int a = 1;
		String ans[] = { "Yes", "No" };
		if(solve())a = 0;
		System.out.println(ans[a]);
	}

}
