import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0 ; i<n ; i++ ) {
			int count = 0;
			int num = Integer.parseInt(br.readLine());
			for (int j = 1; j<=num ; j++ ) {
				if ( num%j == 0 ) {
					count++;
				}
			}
			if ( count == 2) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}