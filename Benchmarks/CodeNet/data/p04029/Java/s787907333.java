import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter =0;
		int num = sc.nextInt();
		int x =1;
		while (x <= num ) {
			counter = counter + x;
			x++;
		}
		System.out.println(counter);
	}
}
