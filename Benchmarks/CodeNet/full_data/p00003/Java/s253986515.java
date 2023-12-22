import java.util.Scanner;

public class Main {
	
	static boolean isRight(int a, int b, int c) {
		if (a * a + b * b == c * c || a * a + c * c == b * b
				|| b * b + c * c == a * a) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a,b,c;
		for(int i=0;i<n;i++){
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			if(isRight(a,b,c)==true)	System.out.println("YES");
			else System.out.println("NO");
		}
	}

}