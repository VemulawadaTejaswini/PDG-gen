import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.valueOf(br.readLine());
		
		int[] array = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			array[i] = Integer.valueOf(st.nextToken());
		}
		
		int suma = 0;
		
		if(n == 2) {
			
			System.out.println(Math.abs(array[0]-array[1]));
			
		}else {
			
			for (int i = 0; i < array.length; i++) {
				
				if ((n-1) - i >= 2) {
					
					int j1 = Math.abs(array[i] - array[i+1]);
					int j2 = Math.abs(array[i] - array[i+2]);
					
					if (j1 < j2) {
						suma += j1;
					}else {
						suma += j2;
						i++;
					}
					
				}else if ((n-1) - i == 1) {
					suma += Math.abs(array[i] - array[i+1]);
				}
				
				
			}

			System.out.println(suma);
			
		}
		
				
	}
}