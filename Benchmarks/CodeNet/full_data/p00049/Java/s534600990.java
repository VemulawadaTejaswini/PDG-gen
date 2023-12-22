import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner stdin = new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] blood = new String[5];
		Arrays.fill(blood, null);
		int a = 0;
		int b = 0;
		int ab = 0;
		int o = 0;
		
		for(int i = 0; i < 5; i++) {

			System.out.print(i + 1 + ", ");
			try {
				blood[i] = input.readLine();

				if(blood[i].equals("A")) {
					a++;
				} 

				if(blood[i].equals("B")) {
					b++;
				} 

				if(blood[i].equals("AB")) {
					ab++;
				} 

				if(blood[i].equals("O")) {
					o++;
				} 
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}

		}


		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);


	}

}