import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
//------------------------------------------------------------
		int N =sc.nextInt();
		sc.close();
		int ans =1+digitSum(N-1);
		for (int A=1; A<N; A++) {
			int B =N-A;
			ans = Math.min(ans, digitSum(A)+digitSum(B));
		}
		System.out.println(ans);

//------------------------------------------------------------
	}
	public static int digitSum(int n) {
		int digitSum = 0;
		while(n>0) {
			digitSum +=n%10;
			n /= 10;
		}
		return digitSum;
	}
}