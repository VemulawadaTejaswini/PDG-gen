
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(Curtain(a,b));
	}

	private static int Curtain(int a, int b) {
		if(a-(2*b)>0) {
			return a-(2*b);
		}else {return 0;}
	}

}
