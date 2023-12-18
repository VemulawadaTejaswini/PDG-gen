import java.util.Scanner;

class Main{
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int r = stdIn.nextInt();
		int d = stdIn.nextInt();
		int x = stdIn.nextInt();
		for(int i = 1;i <=10;i++) {
			x = cal(r,d,x);
			System.out.println(x);
		}
	}
	static int cal(int r,int d,int x) {
		return r * x - d;
	}
}