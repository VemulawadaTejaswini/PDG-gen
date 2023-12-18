import java.util.Arrays;
import java.util.Scanner;

public  class Main  {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B_i[] = new int [N];
		int A_i[] = new int [N];
		for(int i = 0; i<N;i++) {
			B_i[i] = sc.nextInt();
		}
 		boolean flag = true; //出力可能ならば
		Arrays.sort(B_i);
		for(int i = 1; i<=N; i++) {
			if(i>=B_i[i-1]) {
				A_i[i-1] = B_i[i-1];
			}else {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			for(int i =0; i<N; i++) {
				System.out.println(A_i[i]);
			}
		}else System.out.println(-1);
	}
}

