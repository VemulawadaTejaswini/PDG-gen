import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str = br.readLine();
			String[] s = str.split(" ");

			int a = Integer.parseInt(s[0]);
			String b = (s[1]);
			int c = Integer.parseInt(s[2]);

			if(b.equalsIgnoreCase("?")){
				break;
			}

			if(b.equals("+")){
				System.out.println((a + c));
			}else if(b.equals("-")){
				System.out.println((a - c));
			}else if(b.equals("*")){
				System.out.println((a * c));
			}else if(b.equals("/")){
				System.out.println((a / c));
			}
			continue;
		}
	}
}