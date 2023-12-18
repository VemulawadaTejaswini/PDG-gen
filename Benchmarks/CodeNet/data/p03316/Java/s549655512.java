import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		if(Integer.parseInt(s) % s.replace("0", "").length() == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
