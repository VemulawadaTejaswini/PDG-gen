import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((int) (Math.floor(num * 0.5) * Math.ceil(num * 0.5)));
	}
}