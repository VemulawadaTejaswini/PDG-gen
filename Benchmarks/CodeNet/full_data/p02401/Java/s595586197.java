import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		String op = br.readLine();

		if(op.equals("+")){
			System.out.println(a+b);
		} else if(op.equals("-")){
			System.out.println(a-b);
		} else if(op.equals("*")){
			System.out.println(a*b);
		} else if(op.equals("/")){
			System.out.println(a/b);
		}

	}

}