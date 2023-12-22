import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		char c[] = s.toCharArray();
		for(int i = 0; i < c.length; i++){
			if(Character.isUpperCase(c[i])){
				c[i] = Character.toLowerCase(c[i]);
			}else if(Character.isLowerCase(c[i])){
				c[i] = Character.toUpperCase(c[i]);
			}
		}
		System.out.println(String.copyValueOf(c));
	}

}