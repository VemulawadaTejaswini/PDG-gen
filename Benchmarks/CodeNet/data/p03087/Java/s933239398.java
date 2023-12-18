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
		
		int count = 0;
		
		for(int i = 0; i < Q; i++) {
			for(int j = (l[i] - 1); j < (r[i] - 1); j++) {
				if((S.charAt(j) == 'A') && (S.charAt(j + 1) == 'C')) {
					count++;
				}
			}
			
			System.out.println(count);
			count = 0;
			
		}
		
	}
}
