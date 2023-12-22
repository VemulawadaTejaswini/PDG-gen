import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int x=1;
		int i=1;

		while(x!=0) {
			x=Integer.parseInt(br.readLine());
			System.out.println("Case "+i+" :"+x);
			i++;
		}
	}
}
