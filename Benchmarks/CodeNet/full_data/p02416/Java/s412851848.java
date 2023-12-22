import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int i = 0;
		int j = 0;
		char c = '0';
		Character character = new Character(c);
		String reinput = character.toString();

		while( true ){
			String input = br.readLine();

			if( Integer.parseInt(input)==0 ) break;

			for( i=0 ; i<input.length() ; i++ ){
				c = input.charAt(i);
				character = new Character(c);
				reinput = character.toString();
				j = j + Integer.parseInt(reinput);
			}
			sb.append(Integer.toString(j)).append("\n");
			j = 0;
		}
		System.out.print(sb);
	}
}