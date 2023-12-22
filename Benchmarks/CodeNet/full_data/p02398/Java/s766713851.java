import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		/*
		 ** Constraint* *
		    1≤a,b,c≤10000
		 	a≤b
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] streamLine = br.readLine().split(" ");
		int[] intArray = toIntArray(streamLine);
		
		int sum = 0;
		for (int i = intArray[0]; i <= intArray[1]; i++) {
			if (intArray[2] % i  == 0) {
				sum++;
			}
		}
		
		System.out.println(sum);
		
	}
	
	public static int[] toIntArray(String[] strArray) {
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}
}
