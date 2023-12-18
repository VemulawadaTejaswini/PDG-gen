import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int min = Integer.MAX_VALUE;
		for (int i=0;i<=N-3;i++) {
			String tmp = S.substring(i,i+3);
			int value = Integer.parseInt(tmp);
			min = Math.min(min, Math.abs(value-765));
		}
		System.out.println(min);
	}
}