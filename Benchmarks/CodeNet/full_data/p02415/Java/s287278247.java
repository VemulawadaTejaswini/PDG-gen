
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String str = br.readLine();

			StringBuilder sb = new StringBuilder();
			for(char c : str.toCharArray()){
				if(Character.isUpperCase(c)){
					sb.append(Character.toLowerCase(c));
				}else if(Character.isLowerCase(c)){
					sb.append(Character.toUpperCase(c));
				}else{
					sb.append(c);
				}
			}
			System.out.println(sb.toString());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ioe) {
			}

		}
	}
}