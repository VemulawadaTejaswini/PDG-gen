import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		String s = in.nextLine();
		in.close();
		int red = 0, blue = 0;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == 'R') {
				++red;
			} else {
				++blue;
			}
		}
		if (red > blue) {
			System.out.println("R");
		} else {
			System.out.println("B");
		}

	}

}
