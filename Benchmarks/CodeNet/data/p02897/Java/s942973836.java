import java.util.Scanner;

public class Main {
	public static void main(String[] args){
//		整数 
//		N
//		 が与えられます。
//
//		高橋君は、
//		N
//		 以下の正整数の中から等確率で 
//		1
//		 つを選んで 
//		a
//		 とします。
//
//		このとき、
//		a
//		 が奇数である確率を答えてください。

		Scanner sc = new Scanner(System.in);
		double num = sc.nextInt();
		double odd = Math.ceil(num/2);
		double result = odd / num;
		System.out.println(result);
		sc.close();
	}
}
