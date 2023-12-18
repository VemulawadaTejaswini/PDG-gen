import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{


		// 読み込み
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		line=br.readLine();

		String regex = ",";
		String result = line.replaceAll(regex," ");


		System.out.println(result);


	}
}
