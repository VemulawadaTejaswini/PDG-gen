import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		try {
			buf = br.readLine();
		}
		catch(IOException e) {
			System.out.print("Read error.");
			return;
		}
		Scanner scanner = new Scanner(buf);
		double r = Double.parseDouble(scanner.next());
		//System.out.println(String.format("%.6f", Math.PI * r * r) + " " + String.format("%.6f", 2 * Math.PI * r));
		System.out.println(String.format("%.6f", Math.PI * r * r) + " " + String.format("%.6f", 2 * Math.PI * r));
	}
}