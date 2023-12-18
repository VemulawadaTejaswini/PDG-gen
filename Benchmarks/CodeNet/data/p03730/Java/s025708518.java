import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args)throws IOException {
		BufferedReader stdreader = new BufferedReader(new InputStreamReader(System.in));
		String line = stdreader.readLine();
		String[] integers = line.split(" ");
		int a = Integer.parseInt(integers[0]);
		int b = Integer.parseInt(integers[1]);
		int c = Integer.parseInt(integers[2]);

		String answer = "No";

		for(int i =0; i < b; i++){
			if((b*i + c) % a == 0){
				answer = "Yes";
				break;
			}
		}
		System.out.println(answer);
	}
}