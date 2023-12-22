import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dataCount = Integer.parseInt(br.readLine());
		String inputData = br.readLine();
		String[] inputValue = inputData.split(" ");
		int[] outputData = new int[dataCount];
		
		for(int i = 0; i < inputValue.length ; i++){
			outputData[i] = Integer.parseInt(inputValue[i]);
		}
		
		Arrays.sort(outputData);
		
		int min = outputData[0];
		int max = outputData[outputData.length-1];
		int sum = 0;
		
		for(int i = 0; i<outputData.length; i++){
			sum = sum + outputData[i];
		}
				
		System.out.println(min + " " + max + " " + sum);
		
		
	}

}