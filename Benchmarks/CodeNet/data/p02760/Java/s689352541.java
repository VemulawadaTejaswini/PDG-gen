import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[9];
		for(int i = 0;i < 9;i++) {
			A[i] = scan.nextInt();
		}
		int N = scan.nextInt();
		int[] b = new int [N];
		for(int i = 0;i < N;i++) {
			b[i] = scan.nextInt();
		}
		scan.close();
		boolean[] Ab = new boolean[9];
		for(int i = 0;i < 9;i++) {
			for(int ii = 0;ii < N;ii++) {
				if(A[i] == b[ii]) Ab[i] = true;
			}
		}
		boolean flg = false;
		for(int i = 0;i < 3;i++) {
			if(Ab[3*i])if(Ab[3*i+1])if(Ab[3*i+2])flg = true;
			if(Ab[i])if(Ab[i+3])if(Ab[i+6])flg = true;
		}
		if(Ab[0])if(Ab[4])if(Ab[8])flg = true;
		if(Ab[2])if(Ab[4])if(Ab[6])flg = true;
		if(flg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}