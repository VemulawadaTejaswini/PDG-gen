import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double W = sc.nextInt();
		double H = sc.nextInt();
		System.out.println((long)(Math.ceil(W / 2) * Math.ceil(H / 2) + Math.floor(W / 2) * Math.floor(H / 2)));
	}
}
