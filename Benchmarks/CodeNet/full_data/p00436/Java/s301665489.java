import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] cards = new int[2*n];
		
		for(int i = 0; i < 2*n ; i++){
			cards[i] = i+1;
		}

		int m = Integer.parseInt(br.readLine());

		for(int i = 0; i < m; i++){
			int mode = Integer.parseInt(br.readLine());
			
			if(mode == 0){
				cards = riffleShuffle(cards);
			}
			
			else {
				cards = shuffle(cards, mode);
			}
		}
		
		for(int i = 0; i < 2*n; i++){
			System.out.println(cards[i]);
		}
	}
	
	public static int[] shuffle(int[] origin, int k){
		int[] result = new int[origin.length];
		int n = origin.length;
		
		for(int i = 0; i < k; i++){
			//System.out.println("origin "+origin[i]);
			result[n - k + i] = origin[i];
		}
		
		for(int i = 0; i <= n - k - 1; i++){
			result[i] = origin[i + k];
		}
		
		return result;
	}
	
	public static int[] riffleShuffle(int[] origin){
		int n = origin.length / 2;
		
		int[] result = new int[origin.length];
		for(int i = 0; i < n; i++){
			result[i*2] = origin[i];
			result[i*2+1] = origin[n+i];
		}
		
		return result;
	}

}