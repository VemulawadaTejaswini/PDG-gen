import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder from = new StringBuilder(in.readLine());
		StringBuilder to = new StringBuilder();
		final char zero = '0';
		final char one = '1';
		int c1 = 0;
		for(int i = 0; i < from.length(); i++) {
			if(i%2 == 0) {
				to.append(zero);
			}else {
				to.append(one);
			}
			if(from.charAt(i) != to.charAt(i)) {
				c1++;
			}
		}
		to = new StringBuilder();
		int c2 = 0;
		for(int i = 0; i < from.length(); i++) {
			if(i%2 == 0) {
				to.append(one);
			}else {
				to.append(zero);
			}
			if(from.charAt(i) != to.charAt(i)) {
				c2++;
			}
		}
		System.out.println(c1<c2?c1:c2);
	}
}