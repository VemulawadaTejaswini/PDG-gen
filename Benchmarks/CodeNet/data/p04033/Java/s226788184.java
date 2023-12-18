
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

		String answer = "Positive";
		int dif = 0;

		if(a <= 0 && b >= 0){
			answer = "Zero";
		}else if(b < 0){
			dif = b - a;
			if(dif % 2 == 0){
				answer = "Negative";
			}
		}else{
			dif = 0 - a;
			if(dif % 2 == 0){
				answer = "Negative";
			}
		}

		System.out.println(answer);
	}
}
