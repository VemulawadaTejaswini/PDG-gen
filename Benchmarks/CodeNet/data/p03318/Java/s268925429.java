import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int k = 0;
		double sk = 0;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			k = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			return;
		}
		
		for (int m = 1; k > 0; m++) {
			int sm = 0;
			for (int i = m; i > 0; i /= 10) {
				sm += i % 10;
			}
			
			if ((m / sm) < 2) {
				System.out.println(m);
				k--;
			}
		}
		
	}
}
