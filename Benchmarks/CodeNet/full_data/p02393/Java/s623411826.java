import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int taihi;
		if(c<b) {
			taihi =c;
			c=b;
			b=taihi;
		}
		if(b<a) {
			taihi =b;
			b=a;
			a=taihi;
		}
		if(c<b) {
			taihi =c;
			c=b;
			b=taihi;
		}
		System.out.println((a)+" "+(b)+" "+(c));
	}
}