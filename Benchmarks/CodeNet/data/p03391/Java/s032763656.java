import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a[] = new int[n];
		int b[] = new int[n];
		
		long result = 0;
		
		long minus = 0;
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			
			a[i] = Integer.parseInt(tmpArray[0]);
			b[i] = Integer.parseInt(tmpArray[1]);
			
			if(a[i] < b[i]){
				result += (long)b[i];
			}
			
			if(a[i] > b[i]){
				minus += a[i] - b[i];
			}

		}
		
		
		System.out.println(result);
	}

}