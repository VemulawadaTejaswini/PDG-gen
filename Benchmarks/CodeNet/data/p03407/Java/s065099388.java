import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		int a = vd.nextInt();
		int b = vd.nextInt();
		int x = vd.nextInt();
		
		if((a+2*b)>=x) System.out.println("Yes");
		else System.out.println("No");
	}

}
