import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String input;
			char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
			int[] count = new int[26];
			for (;;) {
				input = reader.readLine();
				char ch;
				for (int i = 0; i < input.length(); i++) {
					ch = input.charAt(i);
					if (ch == 'a') {
						count[0]++;
					} else if (ch == 'b') {
						count[1]++;
					} else if (ch == 'c') {
						count[2]++;
					} else if (ch == 'd') {
						count[3]++;
					} else if (ch == 'e') {
						count[4]++;
					} else if (ch == 'f') {
						count[5]++;
					} else if (ch == 'g') {
						count[6]++;
					} else if (ch == 'h') {
						count[7]++;
					} else if (ch == 'i') {
						count[8]++;
					} else if (ch == 'j') {
						count[9]++;
					} else if (ch == 'k') {
						count[10]++;
					} else if (ch == 'l') {
						count[11]++;
					} else if (ch == 'm') {
						count[12]++;
					} else if (ch == 'n') {
						count[13]++;
					} else if (ch == 'o') {
						count[14]++;
					} else if (ch == 'p') {
						count[15]++;
					} else if (ch == 'q') {
						count[16]++;
					} else if (ch == 'r') {
						count[17]++;
					} else if (ch == 's') {
						count[18]++;
					} else if (ch == 't') {
						count[19]++;
					} else if (ch == 'u') {
						count[20]++;
					} else if (ch == 'v') {
						count[21]++;
					} else if (ch == 'w') {
						count[22]++;
					} else if (ch == 'x') {
						count[23]++;
					} else if (ch == 'y') {
						count[24]++;
					} else if (ch == 'z') {
						count[25]++;
					} 
					
				}
				char last = input.charAt(input.length() - 1);
				
				if (last == '.') {
					break;
				}
			}
			
			for (int i = 0; i < count.length; i++) {
				System.out.print(alfabet[i] + " : ");
				System.out.print(count[i]);
				
				if (i != (count.length - 1)) {
					System.out.println();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}