import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.valueOf(br.readLine());
		int W = Integer.valueOf(br.readLine());
		if(S > W) {
			System.out.println("safe");
		}else {
			System.out.println("unsafe");
		}
	}
}