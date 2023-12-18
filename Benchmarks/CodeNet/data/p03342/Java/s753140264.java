import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
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
		String input = br.readLine();
		
		String[] tmpArray = input.split(" ");
		
		long array[] = new long[n];
		
		for(int i = 0; i < n; i++){
			array[i] = Long.parseLong(tmpArray[i]);
		}
		
		long result = 0;
		//最悪の方法
		for(int i = 0; i < n; i++){
			long tmpXor = 0;
			long tmpSum = 0;
			for(int j = i; j < n; j++){
				tmpXor ^= array[j];
				tmpSum += array[j];
//				System.out.println("xor "+tmpXor+" sum "+tmpSum);
				
				if(tmpXor == tmpSum){
//					System.out.println("("+i+","+j+")");
					result++;
				}
				
				else {
					break;
				}
				
				
			}
		}
		
		System.out.println(result);
		
	}

}
