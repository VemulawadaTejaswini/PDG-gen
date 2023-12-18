import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner vd = new Scanner(System.in);
		int a = vd.nextInt();
		int b = vd.nextInt();
		int c = vd.nextInt();
		if(a==b) System.out.println(c);
		if(c==b) System.out.println(a);
		if(a==c) System.out.println(b);
		
	}

}
