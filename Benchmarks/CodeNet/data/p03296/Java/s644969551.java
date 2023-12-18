import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		int n = Integer.parseInt(bufferedReader.readLine());
		
		String slimesInput = bufferedReader.readLine();
		String[] colorsString = slimesInput.split("[\\s]+");
		
		int[] colors = new int[n];
		for(int i = 0; i < n; i++) {
			colors[i] = Integer.parseInt(colorsString[i]);
		}
		
		int answer = 0;
		
		int continuous = 1;
		
		int previous = colors[0];
		int present = 0;
		
		for(int i = 1; i < n; i++) {
			
			present = colors[i];
			
			if (previous == present) {
				continuous++;
			}else {
				answer += continuous / 2;
				continuous = 1;
			}
			
			previous = present;
			present = 0;
		}
		
		answer += continuous / 2;
		
		print(String.valueOf(answer));
		
	}
	
	public static void print(String text) {
		System.out.println(text);
	}
}
