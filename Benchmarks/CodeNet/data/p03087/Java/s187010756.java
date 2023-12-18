import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		
		int[] l = new int[Q];
		int[] r = new int[Q];
		
		for(int i = 0; i < Q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		
		for(int i = 0; i < Q; i++) {
			long sum = 0;
			String s = S.substring(l[i] - 1, r[i]);
			for(int j = 0; j < s.length() - 1; j++) {
				if(s.substring(j, j + 2).equals("AC")) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}
