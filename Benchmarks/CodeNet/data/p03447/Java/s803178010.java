package atcodertest;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		x = x - a*1 - ((x - a*1) / b)*b;
		System.out.println(x);
	}
}
