import java.io.BufferedReader;


public class XCubic {

	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		System.out.println(x*x*x);
	}

}

