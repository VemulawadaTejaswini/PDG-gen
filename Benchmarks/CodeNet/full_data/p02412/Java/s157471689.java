import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String input = br.readLine();
			if(input.equals("0 0")){
				break;
			}
			String[] numbers = input.split(" ");
			Integer max = Integer.parseInt(numbers[0]);
			Integer target = Integer.parseInt(numbers[1]);
			Integer count = 0;
			String result_size = "";
			for(int i = 1; i <= max; i++){
				for(int j = i + 1; j <= max; j++){
					for(int k = j + 1; k <= max; k++){
						if(i + j + k == target){
							count += 1;
						}
					}
				}
			}
			result_size = result_size + count + "\n" ;
			System.out.print(result_size);
		}
	}
}