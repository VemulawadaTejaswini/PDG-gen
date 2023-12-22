import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			String[] tmpArray = br.readLine().split(" ");
			int[] array = new int[n];
			for(int i = 0; i < n; i++){
				array[i] = Integer.parseInt(tmpArray[i]);
			}
			
			int i = -1;
			while(true){
				int[] result = generateAppearanceArray(array);
				i++;
				if(Arrays.equals(array, result)){
					array = result;
					break;
				}
				array = result;
			}
			
			System.out.println(i);
			for(int j = 0; j < n; j++){
				if(j != 0){
					System.out.print(" ");
				}
				System.out.print(array[j]);
				
			}
			System.out.println();
		}
	}
	
	static int[] generateAppearanceArray(int[] original){
		int[] result = new int[original.length];
		int[] count = new int[101];
		
		for(int i = 0; i < original.length ; i++){
			count[original[i]]++;
		}
		
		for(int i = 0; i < result.length ; i++){
			result[i] = count[original[i]];
		}
		
		return result;
	}

}