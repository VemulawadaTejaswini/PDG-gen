import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String line = br.readLine();
		String[] numbers = line.split(" ");
		int[] a = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			a[i] = Integer.parseInt(numbers[i]);
		}
		
		printLine(a);
		
		for (int i = 1; i <= a.length - 1; i++) {
			int v = a[i];
			int j = i - 1;
			
			while(j >= 0 && a[j] > v){
				a[j + 1] = a[j];
				j--;
			}
			
			a[j + 1] = v;
			
			printLine(a);
			
		}
		
	}
	
	static void printLine (int[] b){
		String st = Integer.toString(b[0]);
		for (int k = 1; k < b.length; k++) {
			st += " " + b[k];
		}
		System.out.println(st);
	}
}