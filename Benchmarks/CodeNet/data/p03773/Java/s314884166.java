import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int c = A + B;
		if(c > 24){
			c = c - 24;
		}
		System.out.println(c);
	}
}