import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		String str1 = br.readLine();

		String str2;

		StringBuilder buildrer = new StringBuilder();

		int count =0;

		while (!((str2 = br.readLine()).equals("END_OF_TEXT"))) {
				buildrer.append(str2);
		}
		for(String s: buildrer.toString().split(" ")){
				if(s.equalsIgnoreCase(str1)){
					count++;
				}
		}

		System.out.println(count);
 }

}