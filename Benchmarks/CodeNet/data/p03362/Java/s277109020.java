import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int p[] = new int[55556];
		p[0] = -1;
		p[1] = -1;
		p[2] = 1;
		for(int i = 2; i < p.length; ++i) {
			if(p[i] == 0) {
				p[i] = 1;
				for(int j = 2; j * i < p.length; ++j) {
					p[j * i] = -1;
				}
			}
		}
		int ans[] = new int[n];
		int t = 1;
		for(int i = 0; i < n; ++i) {
			for(int j = t; j < p.length; j += 5) {
				if(p[j] == 1) {
					ans[i] = j;
					t = j + 5;
					break;
				}
			}
		}
		for(int i:ans)
		System.out.print(i + " ");
		System.out.println();
	}

}
