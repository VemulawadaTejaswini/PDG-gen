import java.util.Scanner;

class Main{
	static public void main(String agrs[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d,r=0;
		float f=0.0f;

		d = a/b;
		r = a%b;
		f = (float)a / (float)b;
		System.out.printf("%d %d %f", d, r, f);
	}
}