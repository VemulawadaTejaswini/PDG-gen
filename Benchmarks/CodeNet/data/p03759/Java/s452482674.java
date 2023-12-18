import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] list = str.split(" ");
		int a = Integer.parseInt(list[0]);
		int b = Integer.parseInt(list[1]);
		int c = Integer.parseInt(list[2]);
		String answer = "";
		if(b-a == c-b){
			answer = "YES";
		}else{
			answer = "NO";
		}
		System.out.println(answer);

	}

}
