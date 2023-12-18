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
			double sm = 0;
			for (int i = m; i > 0; i /= 10) {
				sm += i % 10;
			}
			sm = m / sm;
			
			int m2 = m + 1;
			double sm2 = 0;
			for (int i = m2; i > 0; i /= 10) {
				sm2 += i % 10;
			}
			sm2 = m2 / sm2;
			
			if (sm <= sm2) {
				System.out.println(m);
				k--;
			}
		}
		
	}
}
