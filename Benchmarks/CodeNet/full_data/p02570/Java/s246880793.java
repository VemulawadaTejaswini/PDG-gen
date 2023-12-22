import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import static java.lang.Integer.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter prnt = new PrintWriter(System.out);
		
		StringTokenizer st;
		
		int D = parseInt(read.readLine());
		
		int T =parseInt(read.readLine());
		
		int S = parseInt(read.readLine());
		
		if( T * S >= D) {
			prnt.println("Yes");
		}
		else {
			prnt.println("No");
		}
		
		
		
		
		
		
		
		prnt.close();

	}

}
