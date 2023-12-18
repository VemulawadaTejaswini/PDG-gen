import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		AC3 ac = new AC3(s);
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(ac.getAC(l, r));
		}
	}
	
}

class AC3 {
	String s;
	Map<Integer, Boolean> isACMap = new HashMap<>();
	AC3(String s) {
		this.s = s;
		isACMap.put(0, false);
	}
	boolean checkAC(int i) {
		Boolean isAC = isACMap.get(i);
		if (isAC != null) {
			return isAC;
		}
		char A = s.charAt(i - 1);
		char C = s.charAt(i);
		boolean b = (A == 'A' && C == 'C');
		isACMap.put(i, b);
		return b;
	}
	int getAC(int l, int r) {
		int acCount = 0;
		for (int i = l; i < r; i++) {
			if (checkAC(i)) {
				acCount++;
			}
		}
		return acCount;
	}
	
}
