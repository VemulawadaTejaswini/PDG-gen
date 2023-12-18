import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader oi = new BufferedReader(new InputStreamReader(System.in));
		String[] odd = oi.readLine().split("");
		String[] even = oi.readLine().split("");

		int mass = odd.length + even.length;
		String a="";
		for(int i=0; i < mass; i++) {
			if(i%2==1) a = a + odd[i/2];
			else a = a + even[i/2-1];
		}

		System.out.println(a);
	}
}
