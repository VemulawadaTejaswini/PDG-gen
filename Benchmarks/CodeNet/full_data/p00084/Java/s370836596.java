import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str = str.replace(',', ' ');
		str = str.replace('.', ' ');
		String[] s = str.split(" ");
		for(int i = 0; i < s.length; i++){
			if(s[i].length() >= 3 && s[i].length() <= 6)
			System.out.println(s[i]);
		}
	}

}