import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		int q = Integer.parseInt(tmpArray[1]);
		
		long[] array = new long[n + 1];
		
		for(int i = 0; i < q ; i++){
			tmpArray = br.readLine().split(" ");
			if(tmpArray[0].equals("0")){
				add(array, Integer.parseInt(tmpArray[1]), Integer.parseInt(tmpArray[2]), Integer.parseInt(tmpArray[3]) );
				
			}
			
			else {
				System.out.println(array[Integer.parseInt(tmpArray[1])]);
			}
		}
	}
	
	static void add(long[] array, int s, int t, int x){
		for(int i = s; i <= t; i++){
			array[i] += x;
		}
	}

}