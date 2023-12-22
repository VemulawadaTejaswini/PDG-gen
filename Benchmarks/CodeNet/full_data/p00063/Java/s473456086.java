port java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int dataset = 50;
		String[] str = new String[dataset];


		for(int i = 0; i < dataset; i++){

			try {
				str[i] = input.readLine();

			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
		}


		for(int j = 0; j < dataset; j++) {
			StringBuffer sb = new StringBuffer(str[j]);
			if(str[j].equals(sb.reverse().toString())) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}

}