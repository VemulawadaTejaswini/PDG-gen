import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		if (N == 1){
			System.out.println("Hello World");
		}else {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			System.out.println(a+b);
		}
	}
}