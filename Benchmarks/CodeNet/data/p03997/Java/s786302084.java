
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//a, b, hを標準出力
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h =sc.nextInt();
		sc.close();
		if(1<a && a<100 && 1<b && b< 100 && h%2==0) {
			System.out.println((a+b)*h/2);

		}
		
	//1≤a≤100
//		1≤b≤100
//		1≤h≤100
//		入力で与えられる値はすべて整数
//		h は偶数

		
		
	}
	
	
}
