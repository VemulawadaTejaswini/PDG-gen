import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		scan.close();

		if(x<y) {
			int tmp=y;
			y=x;
			x=tmp;
		}

		System.out.println(gcd(x,y));
	}
	static int gcd(int x,int y) {
		if(x%y==0)return y;
		else return gcd(y,x%y);
	}
}