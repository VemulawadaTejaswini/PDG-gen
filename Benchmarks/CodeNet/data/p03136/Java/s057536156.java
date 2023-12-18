import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int L = 0;
		int L_max = 0;
		for(int i = 0;i < N;i++) {
			int l = scn.nextInt();
			L +=l;
			L_max = Math.max(L_max, l);
		}
		
		System.out.println(L_max < L - L_max?"Yes":"No");
	}

}