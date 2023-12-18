import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		long x =  Long.parseLong(W.split(" ")[0]);
		long a =  Long.parseLong(W.split(" ")[1]);
		
		if(x < a)
			System.out.println(0);
		else
			System.out.println(10);
			
	}
}
