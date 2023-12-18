import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(),a = sc.nextInt(),b = sc.nextInt();
		System.out.println(x-a < b -x ? "A" : "B");
	}
}
