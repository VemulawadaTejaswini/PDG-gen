import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a =Integer.parseInt(br.readLine().split(" ")[0]);
		int b = Integer.parseInt(br.readLine().split(" ")[1]);
		
		int c = b-a;
		int counter = 0;
		for(int i = 1; i<c; i++) {
			counter = counter + i;
		}
		int s=counter-b;
		
		System.out.println(s);
	}
}
