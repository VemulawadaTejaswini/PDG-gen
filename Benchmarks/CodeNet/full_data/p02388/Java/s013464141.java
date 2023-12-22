import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XCubic {

	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		System.out.println(x*x*x);
	}

}

