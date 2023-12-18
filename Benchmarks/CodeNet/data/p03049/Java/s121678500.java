import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] AB = new long[3];
		long sum = 0;
		
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			if(s.charAt(0) == 'B' && s.charAt(s.length() - 1) != 'A') {
				AB[0]++;
			} else if(s.charAt(0) != 'B' && s.charAt(s.length() - 1) == 'A') {
				AB[1]++;
			} else if(s.charAt(0) == 'B' && s.charAt(s.length() - 1) == 'A') {
				AB[2]++;
			}
			for(int j = 0; j < s.length() - 1; j++) {
				String S = s.substring(j, j + 2);
				if(S.equals("AB")) {
					sum++;
				}
			}
		}
	
		sum += Math.min(AB[0], AB[1]);
					
		if(AB[0] == AB[1]) {
			if(AB[2] > 0) {
				sum += AB[2] - 1;
			}
		} else {
			sum += AB[2];
		}
		System.out.println(sum);
	}
}
