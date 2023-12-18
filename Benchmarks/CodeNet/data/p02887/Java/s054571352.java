import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char[] s = br.readLine().toCharArray();
		int total = 0;
		for (int i = 0, j = 0; i < n; i = j) {
		    while (j < n && s[i] == s[j])
		        j++;

		    total++;
		}
		
		System.out.println(total);
		
		bw.close();
	}

}
