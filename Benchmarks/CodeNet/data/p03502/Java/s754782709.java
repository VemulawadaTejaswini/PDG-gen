import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
//------------------------------------------------------------
		int N = sc.nextInt();
		int digitSum=0;
		int n =N;
		while (n>0) {
			digitSum += n%10;
			n /= 10;
		}
		if (N%digitSum==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
//------------------------------------------------------------
	}
}