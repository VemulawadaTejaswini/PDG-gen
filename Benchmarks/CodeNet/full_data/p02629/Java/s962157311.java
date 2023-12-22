import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long num = 0;
		int index = 1;
		while (num < N) {
			num += Math.pow(26, index);
			index++;
		}
		List<Integer> alp = new ArrayList<>();
		for (int i = index-2; -1 < i; i--) {
			for (int j = 26; 0 < j; j--) {
				if (Math.pow(26, i)*j <= N) {
					alp.add(j);
					N -= Math.pow(26, i)*j;
					break;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Integer i : alp) {
			sb.append((char) ('a'-1+i));
		}
		System.out.println(sb);
	}
}