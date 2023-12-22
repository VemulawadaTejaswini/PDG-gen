import java.io.IOException;
import java.util.Scanner;
public class Main {

	static int W;
	static int H;
	static int x;
	static int y;
	static int r;

	static boolean judge = true;

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		W = sc.nextInt();
		H = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		r = sc.nextInt();

		String ans;

		check1();
		check2();
		check3();

		if(judge) {
			ans = "Yes";
		}else {
			ans = "No";
		}

		System.out.println(ans);

		sc.close();
	}

	public static void check1() {
		if(x<0 || y<0) {
			judge = false;
		}
	}

	public static void check2() {
		if((x-r)<0 || (y-r)<0) {
			judge = false;
		}
	}

	public static void check3() {
		if((x+r)>W || (y+r)>H) {
			judge = false;
		}
	}
}
