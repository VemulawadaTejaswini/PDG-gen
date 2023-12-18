import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String[] strs = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			strs = br.readLine().split(" ");
		} catch (IOException e) {
			return;
		}
		
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		
		System.out.println(Math.max(a + b, Math.max(a - b, a * b)));
	}
}
