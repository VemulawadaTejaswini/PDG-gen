import java.io.*;
import java.util.*;

public class Main {
	private static final int READ_COUNT = 1;
	private static List<String> strList = new ArrayList<>();
	
	public static void main(String[] args) {
		read();
		
		int n = Integer.parseInt(strList.get(0));
		
		System.out.println((n % 2 == 0) ? n : n * 2);
	}
	
	private static void read() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			for (int i = 0; i < READ_COUNT; i++) {
				strList.add(br.readLine());
			}
		} catch (IOException e) {
		}
	}
}
