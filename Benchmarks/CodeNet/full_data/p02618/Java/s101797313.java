import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int[] c = new int[26];
		int[][] s = new int[D][26];
		for (int i=0;i<D;i++) {
			int max_val = 0;
			int max_ind = 0;
			for (int j=0;j<26;j++) {
				s[i][j] = sc.nextInt();
				if (max_val<s[i][j]) {
					max_val = s[i][j];
					max_ind = j;
				}
			}
			System.out.println(max_ind+1);
		}
	}
}