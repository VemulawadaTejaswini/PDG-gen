import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// たて a cm よこ b cm の長方形の面積と周の長さを求めるプログラム
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a * b);
	}

}

