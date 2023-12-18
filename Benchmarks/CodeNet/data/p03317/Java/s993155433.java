import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt() - 1;
		String s = in.nextLine();
		System.out.println(n / k);
	}
}
