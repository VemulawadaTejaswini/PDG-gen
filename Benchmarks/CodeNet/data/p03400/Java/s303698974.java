import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] argas) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int day = Integer.parseInt(br.readLine().split(" ")[0]);
		int rest = Integer.parseInt(br.readLine().split(" ")[1]);
		
		int[] a = new int[n];
		
		int counter=0;
		for(int i=0; i<n;i++) {
			int choko =(day-1)/(2*i);
			counter = counter +choko;
		}
		System.out.println((counter+rest));
	}

}
