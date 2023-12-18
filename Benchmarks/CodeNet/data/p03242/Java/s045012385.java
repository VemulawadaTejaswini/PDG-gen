import java.util.Scanner;
public class Main{
	public static int Int(int a) {
		int i=0;
		if(a==9) {
			i=1;
		}
		else {
			i=9;
		}
		return i;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=Int(a%10);
		a/=10;
		int c=Int(a%10);
		a/=10;
		int d=Int(a%10);
		System.out.println(d+""+c+""+b);
	}
}