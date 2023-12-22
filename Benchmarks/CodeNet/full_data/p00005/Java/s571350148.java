import java.util.Scanner;
public class Main {
	public static int GCD(int a,int b) {
		int c;
		while(a%b!=0) {
			c = a%b;
			a = b;
			b = c;
		}
		return b;
	}
	public static int LCM(int a,int b) {
		return a/GCD(a,b)*b;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x,y;    //变量
		while(in.hasNext()) {
			x = in.nextInt();
			y = in.nextInt();
			System.out.println(GCD(x,y)+" "+LCM(x,y));
		}
		in.close();
	}
}
