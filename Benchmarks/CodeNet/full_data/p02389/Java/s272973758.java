import java.util.Scanner;

public class Main {
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int menseki = a*b;
		int shuu = (a+b)*2;
		System.out.println(menseki+" "+shuu);
	}

	public static void main(String[] args)  {
		new Main().exec();
	}
}