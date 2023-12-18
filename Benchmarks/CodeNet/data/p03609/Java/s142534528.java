import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		System.out.println(Math.max(x-t, 0));
    }
}