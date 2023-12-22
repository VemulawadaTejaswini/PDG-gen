import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();

		for(int i = 0; i < input.length(); i++){

			char token = input.charAt(i);

			if(Character.isUpperCase(token)){
				sb.append(Character.toLowerCase(token));
			}else{
				sb.append(Character.toUpperCase(token));
			}

		}

		System.out.println(sb);

	}
}