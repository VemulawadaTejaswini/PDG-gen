import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		int n = vd.nextInt();
		int a = vd.nextInt();
		int b = vd.nextInt();
		if(n*a<b) System.out.println(a*n);
		else System.out.println(b);
		
	}

}
