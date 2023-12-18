
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		int a = Integer.parseInt(strlist[0]);
		int b = Integer.parseInt(strlist[1]);
		int c = Integer.parseInt(strlist[2]);
		int answer = 3;

		if(a == b){
			answer = answer - 1;
		}
		if(b == c){
			answer = answer - 1;
		}
		if(c == a){
			answer = answer - 1;
		}

		System.out.println(answer);

	}

}
