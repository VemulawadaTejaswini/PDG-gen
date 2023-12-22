import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai8_4 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String result = br.readLine();

		if(str.indexOf(result) != -1){
			System.out.println("Yes.");
		}else{
			System.out.println("No.");
		}
	}
}