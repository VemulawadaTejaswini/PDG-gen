import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] s = new String[n];
//		boolean[] biginB = new boolean[n];
//		boolean[] endA = new boolean[n];
		int endA = 0;
		int biginB = 0;
		int endAbiginB = 0;
		int inAns =0;

		for (int i=0;i<n; i++) {
			s[i] = sc.next();
			for (int j=0;j<s[i].length()-2;j++) {
				if (s[i].charAt(j)=='A' && s[i].charAt(j+1)=='B') {
					inAns++;
				}
			}

			if (s[i].charAt(s[i].length()-1)=='A' && s[i].charAt(0)=='B') {
				endAbiginB ++;
			} else if (s[i].charAt(s[i].length()-1)=='A') {
				endA ++;
			} else if(s[i].charAt(0)=='B') {
				biginB ++;
			}
		}

		int diff = endA - biginB;
		int subans = Math.min(endA, biginB);
		if (diff >=0) {
			subans = subans + diff+ (endAbiginB-diff) / 2;
		} else {
			subans = subans + (endAbiginB-diff) / 2;
			if (diff % 2 ==1 && (endAbiginB-diff % 2) == 1) {
				subans += 1;
			}
		}

//		System.out.println("subans:"+subans+" inans:"+inAns);
		System.out.println(subans+inAns);
	}
}
