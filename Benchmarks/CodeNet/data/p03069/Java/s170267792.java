import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		String[] strs = s.split("");
		int white = 0;
		int black =0;
		for(int i=0; i<n; i++) {
			if(strs[i].equals("#")) {
				black++;
			}else {
				white++;
			}
		}
		System.out.println(Math.min(black, white));
	}
}
