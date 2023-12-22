import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String inputValue = br.readLine();
		String[] inputArray = inputValue.split(" ");

		int a = Integer.parseInt(inputArray[0]);
		int b = Integer.parseInt(inputArray[1]);
		int c = Integer.parseInt(inputArray[2]);

		if(a < b && b < c && a != b && b != c){
			System.out.println("Yes");
		}else{
			System.out.println("NO");
		}

	}
}