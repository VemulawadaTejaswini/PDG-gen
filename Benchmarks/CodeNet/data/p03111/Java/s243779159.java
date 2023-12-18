import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] map = new int[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < Math.pow(4, N); i++) {
			String tmp = "00000000" + Integer.toString(i, 4);
			char[] s = tmp.substring(tmp.length()-N,tmp.length()).toCharArray();
			
			int join = 0;
			int a = 0;
			int b = 0;
			int c = 0;
			for (int j = 0; j < s.length; j++) {
				if (s[j] == '0') {
					if (a != 0)
						join++;
					
					a+= map[j];
				} else if (s[j] == '1') {
					if (b != 0)
						join++;
					
					b+= map[j];
				} else if (s[j] == '2') {
					if (c != 0)
						join++;
					
					c+= map[j];
				}
			}
			
			if (a == 0 || b == 0 || c == 0)
				continue;
			
			int totalMp = Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) + (join * 10);
			
			min = Math.min(totalMp, min);
		}
		
		System.out.println(min);
	}
}
