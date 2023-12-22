import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = scanner.nextInt();
		long result = 0;
		for(int i = 0; i < n; i++)
			result += (i + 1) * (n - i);
		for(int i = 1; i < n; i++) {
			int temp1 = scanner.nextInt() -1, temp2 = scanner.nextInt() -1;
			int min = Math.min(temp1, temp2), max = Math.max(temp1, temp2);
			result -= (min + 1) * (long)(n - max);
		}
		log.write("" + result);
		log.flush();
	}
}
