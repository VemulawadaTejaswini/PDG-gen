import java.util.Scanner;
import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n = Integer.parseInt(br.readLine());
		
		Scanner scan = new Scanner(System.in);
		int min = 0;
		int max = 0;
		long sum = 0;
		int input_num;
		for (int i = 0; i < n; i++) {
			input_num = scan.nextInt();
			if (i == 0 || min > input_num) {
				min = input_num;
			}
			if (i == 0 || max < input_num) {
				max = input_num;
			}
			
			sum += Long.valueOf(input_num);
		}
		
		System.out.println(min +" "+ max +" "+ sum);
	}
}