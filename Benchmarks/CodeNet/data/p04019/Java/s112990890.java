import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );

		int nou = str.length() - str.replace("N", "").length();
		int wes = str.length() - str.replace("W", "").length();
		int sou = str.length() - str.replace("S", "").length();
		int eas = str.length() - str.replace("E", "").length();


		String answer = "Yes";

		if((nou==0 && sou!=0) || (nou!=0 && sou==0)){
			answer = "No";
		}else if((wes==0 && eas!=0) || (wes!=0 && eas==0)){
			answer = "No";
		}

		System.out.println(answer);
	}
}
