import java.util.Scanner;
public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(a-2*b >= 0 ? a-2*b : 0);
	}
}
