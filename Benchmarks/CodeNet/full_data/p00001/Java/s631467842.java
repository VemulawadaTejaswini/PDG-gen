import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		int max = Integer.MIN_VALUE;
		ArrayList<Integer> arr =  new ArrayList<Integer>();
		
		
		for(int i = 0; i < 10000; i++){
			String input = br.readLine();
			int inputAngka = Integer.parseInt(input);
			
			arr.add(inputAngka);
		}
		
		int[] arrayResult = new int[arr.size()];
		
		for(int i = 0; i < arr.size(); i++){
			arrayResult[i] = arr.get(i);
		}
		
		Arrays.sort(arrayResult);
		
		int max1 = arrayResult[arrayResult.length-1];
		int max2 = arrayResult[arrayResult.length-2];
		int max3 = arrayResult[arrayResult.length-3];
		
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);

	}

}