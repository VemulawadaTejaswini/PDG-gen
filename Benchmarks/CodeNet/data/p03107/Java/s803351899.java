import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int red = 0;
		int blue = 0;
		while (input.length() != 1) {
			if (input.charAt(0) == '0') {
				red++;
			} else {
				blue++;
			}
			input = input.substring(1);
		}
		if (input.charAt(0) == '0') {
			red++;
		} else {
			blue++;
		}
		int ans = 0;
		if (red > blue) {
			ans = blue * 2;
		} else {
			ans = red * 2;
		}
		System.out.println(ans);
		
	}

}
