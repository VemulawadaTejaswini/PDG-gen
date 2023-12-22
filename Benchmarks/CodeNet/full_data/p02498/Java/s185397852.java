import java.util.Scanner;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mojiretu;
		int i;
		char s;
		mojiretu = sc.next();
		for (i = 0; i < mojiretu.length(); i++) {
			s = mojiretu.charAt(i);
			s = Character.toUpperCase(s);
		}
		System.out.println(mojiretu);
	}
}