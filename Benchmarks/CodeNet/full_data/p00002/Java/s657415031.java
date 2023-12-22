import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static final int MAX = 200000;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String  str[] = new String[1];

		while(true){

			str = br.readLine().split(" ");

			System.out.println(String.valueOf(Integer.parseInt(str[0])+Integer.parseInt(str[1])).length());

		}


	}

}