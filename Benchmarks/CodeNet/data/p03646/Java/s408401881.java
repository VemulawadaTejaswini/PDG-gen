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
		int k = Integer.parseInt(br.readLine());
		
		int n = 2;
		int[] array = null;
		
		if(k == 0){
			n = 2;
			array = new int[2];
			array[0] = 1;
			array[1] = 1;
		}
		
		System.out.println(n);
		for(int i = 0; i < array.length ; i++){
			if(i == 0){
				System.out.print(array[i]);
			
			}
			else{
				System.out.print(" "+array[i]);
				
			}
		}
	}

}
