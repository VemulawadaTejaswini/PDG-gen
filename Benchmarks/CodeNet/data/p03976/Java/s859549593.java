import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		////////////////////////////////////
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] alphabet = new int[26];
		String[] p = new String[n];
		char c;
		int m;
		int x;
		int cnt = 0;
		boolean flag = true;
		
		for (int i=0; i<n; i++) {
			flag = true;
			p[i] = sc.next();
			for (int j=0; j<i; j++) {
				if (p[i].equals(p[j])) {
					flag = false;
					break;
				}
			}
			if (!flag) continue;
			
			c = p[i].charAt(0);
			m = (int) (c - 'A');
			alphabet[m]++;
		}
		
		Arrays.sort(alphabet);
		
		
		while (flag) {
			x=0;
			flag = false;
			for (int i=25; i>=0; i--) {
				if (alphabet[i]>0) {
					alphabet[i]--;
					x++;
					if (x==k) {
						flag = true;
						cnt++;
						break;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
		////////////////////////////////////
		sc.close();
	}
}