import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int x, a, b;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		b = x;
		while(b > 2) {
			b -= 1;
			a = b;
			while(a > 0) {
				a -= b;
				if(a == 0) {
					System.out.print(b);
				}
			}
		}
		System.out.print(1);
	}
}