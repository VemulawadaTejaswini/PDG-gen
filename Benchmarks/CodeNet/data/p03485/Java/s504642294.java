import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		int a = vd.nextInt();
		int b = vd.nextInt();
		vd.close();
		int i = a/b;
		if((a+b)%2==1)System.out.println(i+1);
		else System.out.println(i);

	}

}
