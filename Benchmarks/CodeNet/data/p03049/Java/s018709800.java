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
				if(s.substring(j, j + 2).equals("AB")) {
					sum++;
				}
			}
		}
		long a = Math.min(AB[0], AB[1]);
		AB[0] -= a;
		AB[1] -= a;
		sum += a;
		
		if(AB[0] == 0 && AB[1] == 0) {
			if(AB[2] > 0) {
				sum += AB[2] - 1;
			}
		} else {
			long b = 0;
			if(AB[0] > AB[1]) {
				b = Math.min(AB[0], AB[2]);
				AB[0] -= b;
				AB[2] -= b;
			} else {
				b = Math.min(AB[1], AB[2]);
				AB[1] -= b;
				AB[2] -= b;
			}
			sum += b;
			sum += AB[2];
		}
		System.out.println(sum);
	}
}
