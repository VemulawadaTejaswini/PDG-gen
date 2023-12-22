import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Main me = new Main();
		System.out.println(me.fact(Integer.parseInt(in.readLine())));
	}
	private long fact(long n){
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
}