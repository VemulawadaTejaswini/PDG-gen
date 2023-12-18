import java.util.Scanner;

class Main {
	static void f(int A, int B, int C, int D) {
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 2; k++) {
					int ans = A;
					ans += (i == 0) ? B : (-B);
					ans += (j == 0) ? C : (-C);
					ans += (k == 0) ? D : (-D);
					if(ans == 7) {
						char op1 = (i == 0) ? '+' : '-';
						char op2 = (j == 0) ? '+' : '-';
						char op3 = (k == 0) ? '+' : '-';
						System.out.println(A+""+op1+""+B+""+op2+""+C+""+op3+""+D+"=7");
						return;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int A = s/1000; s -= A*1000;
		int B = s/100; s -= B*100;
		int C = s/10, D = s%10;
		f(A,B,C,D);
	}
}