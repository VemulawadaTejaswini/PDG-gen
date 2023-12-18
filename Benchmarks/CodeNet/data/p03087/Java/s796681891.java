import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		AC2 ac = new AC2(s);
		int[] anses = new int[q];
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			anses[i] = ac.getAC(l, r);
		}
		for (int ans : anses) {
			System.out.println(ans);
		}
		
	}
	
}

class AC2 {
	int[] acCounts;
	AC2(String s) {
		acCounts = new int[s.length()];
		boolean isBeforeA = false;
		int acCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (isBeforeA) {
				if (ch == 'C') {
					acCount++;
					acCounts[i] = acCount;
					isBeforeA = false;
					continue;
				}
			}
			acCounts[i] = acCount;
			isBeforeA = (ch == 'A') ? true : false;
		}
	}
	int getAC(int l, int r) {
		return acCounts[r - 1] - acCounts[l - 1];
	}
}
