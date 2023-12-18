import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		height -= sc.nextInt();
		width -= sc.nextInt();
		System.out.println(height * width);
	}
}