import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while(!(str=br.readLine()).equals("0")){
			int n = Integer.parseInt(str);
			System.out.println(fact(n));
		}
	}

	static int fact(int n){
		int c=0;

		while(n>=5){
			c += n/5;
			n/=5;
		}
		return c;
	}

}