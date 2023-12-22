import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String INPUT = br.readLine();
		int i = 0;
		int j = 0;
		String a;

		while( (a = br.readLine()).equals("END_OF_TEXT")!=true ){
			String[] input = a.split(" ");
			for( i=0 ; i<input.length ; i++ ){
				if( (INPUT.toUpperCase()).equals(input[i].toUpperCase()) ){
					j++;
				}
				if( input[i].equals("END_OF_TEXT") ) break;
			}
		}

		System.out.println(Integer.toString(j));
	}
}