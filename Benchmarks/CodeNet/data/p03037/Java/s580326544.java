import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int i,j,tempL,tempR;
		int L = Integer.MIN_VALUE;
		int R = Integer.MAX_VALUE;

		for(i = 0; i < m; i++) {
			tempL = scan.nextInt();
			tempR = scan.nextInt();
			L = Math.max(L, tempL);
			R = Math.min(R, tempR);
		}

		if(L > R) {
			System.out.println(0);
			return;
		}else {
			System.out.println(R - L + 1);
		}
	}
}
