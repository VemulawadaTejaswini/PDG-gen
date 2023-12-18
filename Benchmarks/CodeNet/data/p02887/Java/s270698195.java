import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String line = br.readLine();
		
		char ac = ' ';
		int total = 0;
		for (int i = 0; i < line.length(); i++) {
			if(line.charAt(i) != ac) {
				total++;
				ac = line.charAt(i);
			}
		}
		
		System.out.println(total);
		
		bw.close();
	}

}
