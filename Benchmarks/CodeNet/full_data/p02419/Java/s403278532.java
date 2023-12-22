import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner scan = new Scanner(System.in);

		String str1 = br.readLine();

		String str2;

		int count =0;

		StringBuilder buildrer = new StringBuilder();



		while (true) {
			if((str2 = scan.nextLine()).equals("END_OF_TEXT")){
				break;
			}

				if(str1.equalsIgnoreCase(str2)){
					/*System.out.println(str1);*/
					count++;
				}
		}

		System.out.println(count);
 }