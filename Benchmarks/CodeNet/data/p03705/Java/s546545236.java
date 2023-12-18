

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();

		long answer;

		if(n==1 && a!=b){
			answer = 0;
		}else if(a>b){
			answer = 0;
		}else{
			answer = b*(n-2) - a*(n-2) + 1;
		}

		System.out.println(answer);
	}

}
