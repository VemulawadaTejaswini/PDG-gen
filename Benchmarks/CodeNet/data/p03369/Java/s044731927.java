import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String source=br.readLine();
		char s1=source.charAt(0);
		char s2=source.charAt(1);
		char s3=source.charAt(2);

		int price=700;

		if(s1=='○'){
			price+=100;
		}
		if(s2=='○'){
			price+=100;
		}

		if(s3=='○'){
			price+=100;
		}

		System.out.println(price);
	}
}
