import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int n = scan.nextInt();
		int x[]=new int[n];
		int y[]=new int[n];
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			x[i]=scan.nextInt();
			y[i]=scan.nextInt();
			a[i]=scan.nextInt();
		}
		scan.close();

		int white_w=w;
		int white_h=h;
		for(int i=0;i<n;i++) {
			switch(a[i]) {
			case 1:
				white_w-=x[i];
				break;
			case 2:
				white_w-=(w-x[i]);
				break;
			case 3:
				white_h-=y[i];
				break;
			case 4:
				white_h-=(h-y[i]);
				break;
			}
		}
		System.out.println((white_w*white_h>0)? white_w*white_h : "0");
	}
}