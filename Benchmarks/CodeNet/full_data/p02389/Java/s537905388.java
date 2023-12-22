import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //縦
		int b = sc.nextInt(); //横
		
		System.out.print(a*b + "　");
		System.out.print((a+b)*2);
	}
}