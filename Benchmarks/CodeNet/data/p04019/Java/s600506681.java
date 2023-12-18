import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int[] map = S.chars().distinct().toArray();
		
		int NS = 0;
		int EW = 0;
		for (int c : map) {
			if (c == 'N') {
				NS += 1;
			} else if (c == 'S') {
				NS += -1;
			} else if (c == 'E') {
				EW += 1;
			} else if (c == 'W') {
				EW += -1;
			}
			
		}
		
		String ans = Math.abs(NS) + Math.abs(EW) == 0 ? "Yes" : "No";
		System.out.println(ans);
		
	}
}