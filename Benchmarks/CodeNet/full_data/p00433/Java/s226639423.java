import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sc_a = 0, sc_b = 0;
		for(int i = 0; i < 4; i++) {
			sc_a += sc.nextInt();
		}
		for(int i = 0; i < 4; i++) {
			sc_b += sc.nextInt();
		}
		System.out.println(sc_a > sc_b ? sc_a : sc_b);
	}
}