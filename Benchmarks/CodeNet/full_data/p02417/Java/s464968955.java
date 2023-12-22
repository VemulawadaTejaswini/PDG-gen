import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		int count[] = new int[26];
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			
			
			while(true) {
				String input = br.readLine();
				
				if(input == null || input.equals("")) break;
				
				for(int i = 0; i < input.length(); i++) {
					char c = input.charAt(i);
					if(isUpperCase(c)) {
						count[c - 'A']++;
					}
					if(isLowerCase(c)) {
						count[c - 'a']++;
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < 26; i++) {
				char c = (char) (i + 'a');
				sb.append(c + " : " + count[i]);
				sb.append("\n");
			}
			
			System.out.print(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean isUpperCase(char c) {
		return 'A' <= c && c <= 'Z';
	}
	
	private static boolean isLowerCase(char c) {
		return 'a' <= c && c <= 'z';
	}
}
