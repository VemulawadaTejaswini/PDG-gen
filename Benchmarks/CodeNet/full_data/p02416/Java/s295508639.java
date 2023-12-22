import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();

		while(true){

			String input = br.readLine();
			if(input.equals("0")){
				break;
			}

			int total = 0;
			char[] charAry = input.toCharArray();
			for(int i = 0; i < charAry.length; i++){
				total += Character.getNumericValue(charAry[i]);
			}

			System.out.println(total);
		}


	}

}