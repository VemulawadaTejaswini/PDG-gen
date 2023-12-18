import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{


		// 読み込み
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] temp;

		line=br.readLine();
		temp=line.split(" ");

		int n = Integer.valueOf(temp[0]);

		int x = 800*n;
		int y = 200*(n/15);



		System.out.println(x-y);


	}
}
