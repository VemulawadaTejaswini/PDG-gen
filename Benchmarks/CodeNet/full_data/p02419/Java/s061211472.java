import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String W = buf.readLine().toLowerCase();
		String str;
		int check;
		int end = -1;
		int count = 0;
		while (true) {
			str = buf.readLine();
			if (str.equals("END_OF_TEXT")) break;
			str = str.toLowerCase();
			check = 0;
			while(true) {
				check = str.indexOf(W, check) + 1;
				if (check == 0) break;
				count++;
			}
		}
		System.out.println(count);
	}

}