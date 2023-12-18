import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int init = 0;
		Scanner s = new Scanner(System.in);
		String string = s.next();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '+') {
				init++;
			}
			else {
				init--;
			}
		}
		System.out.println(init);
	}

}
