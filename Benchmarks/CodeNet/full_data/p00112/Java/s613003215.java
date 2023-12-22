import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] spend = new int[n];
		
		for(int i = 0 ; i < n; i++){
			spend[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(spend);
		int[] waitTime = new int[n];
		int sum = 0;
		for(int i = 1; i < n; i++){
			waitTime[i] = waitTime[i - 1] + spend[i - 1];
			sum += waitTime[i];
			//System.out.println("WT "+waitTime[i]);
		}
		System.out.println(sum);
	}

}