import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
/*
		int a;
		do{
			System.out.print("窓の長さ:");
			a = stdIn.nextInt();
		}while(!(a>=1 && a<=100));

		int b;
		do {
			System.out.print("カーテンの長さ:");
			b = stdIn.nextInt();
		}while(!(b>=1 && b<=100));

		int c = b *= 2; //両カーテンの長さの合計

		if(a-y)
		System.out.println("カーテンで隠れていない部分の横方向の長さは"+(a-c)+"です。");

		else {
			System.out.println(0);
		}
	*/
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if(a>=b*2) {
			System.out.println(a-b*2);
		}else {
			System.out.println(0);
		}
		
		
		

	}

}
