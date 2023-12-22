import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    char ch;
	    String inputed;
		try {
			inputed = br.readLine();
		     for(int i = 0; i < inputed.length(); i++){
	             ch = inputed.charAt(i);

	             if(Character.isUpperCase(ch)){
	                 System.out.print(Character.toLowerCase(ch));
	             }else if(Character.isLowerCase(ch)){
	                 System.out.print(Character.toUpperCase(ch));
	             }else{
	                 System.out.print((char)ch);
	             }
	         }
		     System.out.printf("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

