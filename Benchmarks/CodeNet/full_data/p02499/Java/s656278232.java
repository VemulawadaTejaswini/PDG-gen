import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int[] count = new int[26];
			String line = reader.readLine();
			while(line != null) {
				for(int i=0; i<line.length(); i++) {
					char s = line.charAt(i);
					if(s>='A' && s<='Z') {
						count[s-'A']++;
					} else if(s>='a' && s<='z') {
						count[s-'a']++;
					}
				}
				line = reader.readLine();
			}
			for(int i=0; i<26; i++) {
				System.out.println((char)('a' + i) + " : " + count[i]);
			}
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("??\????????£????????????????????????");
		}
	}
}