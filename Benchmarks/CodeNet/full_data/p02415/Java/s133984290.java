import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		String input = br.readLine();
		int i = 0;
		char c = input.charAt(i);
		Character character = new Character( c );
		String inputer = character.toString();

		while( true ){
			if( Character.isUpperCase(input.charAt(i)) ){
				sb.append(inputer.toLowerCase());
			}else{
				sb.append(inputer.toUpperCase());
			}
			i++;

			if( input.length()==i ) break;

			 c = input.charAt(i);
			 character = new Character( c );
			 inputer = character.toString();
		}

		System.out.println(sb);
	}
}