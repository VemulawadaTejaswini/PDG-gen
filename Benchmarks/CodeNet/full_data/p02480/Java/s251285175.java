import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throw java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(in.readLine());
		System.out.println(x*x*x);
	}
}