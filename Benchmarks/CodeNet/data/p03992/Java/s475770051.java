import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String word[] = str.split("");
		for(int i = 0; i < 12; i++) {
			System.out.print(word[i]);
			if (i == 3) System.out.print(" ");
		}
			System.out.println("");
	}
}