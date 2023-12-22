import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
//http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0007&lang=jp
	public static void main(String args[]) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n  = Integer.parseInt(br.readLine());	
			double result = 100;
			
			for(int i = 0; i < n; i++){
				result = Math.ceil(result*1.05);
			}

			System.out.println((int)result * 1000);
	}
	
}