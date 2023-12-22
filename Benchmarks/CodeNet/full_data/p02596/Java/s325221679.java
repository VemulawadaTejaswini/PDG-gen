import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer input = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
		Integer SEVEN = 7;
		int s=7;
		int counter = 1;
		while(s <= 1000000) {
			if(s%input==0) {
				System.out.println(counter);
			}
			else {
				s = s*10 + SEVEN;
				counter++;
			}	
		}
		if(counter == 7) System.out.println(-1);
	}
}
