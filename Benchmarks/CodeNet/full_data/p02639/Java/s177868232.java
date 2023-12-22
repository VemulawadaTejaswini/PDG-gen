import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int i=1;
			if(scn.nextInt() == 0) {
				System.out.println(i);
				return;
			}
		}
	}
}
