
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] list = str.split("");
		String answer = "yes";
		for(int i=0; i<list.length; i++){
			if(str.length() - str.replace(list[i], "").length() != 1){
				answer = "no";
				break;
			}
		}
		System.out.println(answer);
	}
}


