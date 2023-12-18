import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S1 = sc.next();
		String S2 = sc.next();

		sc.close();
		
		if(N==1) System.out.println(3);
		else System.out.println(domino(S1));
	}
	
	public static long domino(String S1) {
		long score = 1;
		boolean hor = false;
		
		int i = 0;
		if(S1.charAt(0) == S1.charAt(1) ) {
			score *= 6;
			hor = true;
			i = 2;
		}else {
			score *= 3;
			hor = false;
			i = 1;
		}
		
		for(; i < S1.length()-1; i++) {
			if(S1.charAt(i) == S1.charAt(i+1)) {
				if(hor) {
					score *= 3;
				}else {
					score *= 2;
				}
				hor = true;
				i++;
			}else {
				if(!hor) {
					score *=2;
				}
				hor = false;
			}
		}
		
		if(!hor && i == S1.length()-1) score *= 2;
		
		return score;
	}

}
