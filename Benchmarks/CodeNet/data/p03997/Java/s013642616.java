import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		//台形
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();//上辺
		int b =sc.nextInt();//底辺
		int h =sc.nextInt();//高さ
		System.out.println((a+b)*h/2);//台形の面積
	}

}