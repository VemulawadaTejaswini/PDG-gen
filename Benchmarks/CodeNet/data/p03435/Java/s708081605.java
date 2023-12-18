import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		int G = sc.nextInt();
		int H = sc.nextInt();
		int I = sc.nextInt();
		int sum = A+E+I;
		Main main = new Main();
		if (main.checkSum(sum,A,H,F)==false) {
			System.out.println("No");
			return ;
		}
		if (main.checkSum(sum,D,B,I)==false) {
			System.out.println("No");
			return ;
		}
		if (main.checkSum(sum,D,H,C)==false) {
			System.out.println("No");
			return ;
		}
		if (main.checkSum(sum,G,E,C)==false) {
			System.out.println("No");
			return ;
		}
		if (main.checkSum(sum,G,B,F)==false) {
			System.out.println("No");
			return ;
		}
			System.out.println("Yes");
	}

	public boolean checkSum(int sum ,int A,int B,int C) {
		if (A+B+C==sum)
			return true;
		return false;
	}
}