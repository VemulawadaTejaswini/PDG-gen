import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int n;

	double px,py,r;
	double x1,x2,x3,y1,y2,y3;			//読み込み用
	double x12,x23,y12,y23,xy12,xy23;	//演算用

	private void mainrun() {
		scan = new Scanner(System.in);

		n = scan.nextInt();

		for(int i = 0;i < n;i++) {
			looprun();
		}

		scan.close();
	}

	private void looprun() {

		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		x3 = scan.nextDouble();
		y3 = scan.nextDouble();

		x12 = 2 * ( x2 - x1) ;
		x23 = 2 * ( x3 - x2 );
		y12 = 2 * ( y2 - y1 );
		y23 = 2 * ( y3 - y2 );
		xy12 = x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2;
		xy23 = x2 * x2 - x3 * x3 + y2 * y2 - y3 * y3;

		py = (x23 * xy12 - x12 * xy23 )/(x12 * y23 - x23 * y12);

		px = (y12 * xy23 - y23 * xy12 ) / (x12 * y23 - x23 * y12) ;

		r = Math.hypot(x1 - px , y1 - py);

		System.out.println(String.format("%.3f %.3f %.3f",px ,py ,r ));
	}
}
