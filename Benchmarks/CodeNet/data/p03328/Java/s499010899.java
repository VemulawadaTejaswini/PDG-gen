import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = b - a;
		int height = 0;
		for (int i = x; i >= 0; i--) {
			height += i;
		}
		System.out.println(height - b);
	}
}