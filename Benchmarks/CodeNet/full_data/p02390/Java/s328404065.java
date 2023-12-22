import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=a/60;
		int c=(a%60)/60;
		int d=(a%60)%60;
		System.out.printf("%d:%d:%d\n",b,c,d);
	}
}


