import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int h1 = sc.nextInt();
		int w1 = sc.nextInt();
		System.out.println((w - w1)*(h - h1));
	}
}