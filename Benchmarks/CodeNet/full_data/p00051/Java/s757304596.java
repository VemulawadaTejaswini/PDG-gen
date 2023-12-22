import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


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
				
		for(int i = 0; i < n; i++){
			MaxMinManager mg = new MaxMinManager(br.readLine());
			
			System.out.println(mg.difference());
		}

	}

}

class MaxMinManager {
	int max;
	int min;
	
	public MaxMinManager(String str){
		char[] carray = str.toCharArray();
		
		max = generateMax(carray);
		min = generateMin(carray);
	}
	
	private int generateMax(char[] carray){
		StringBuffer sb = new StringBuffer();
		Arrays.sort(carray);
		sb.append(carray);
		sb.reverse();
//		System.out.println("sorted Max"+sb.toString());
		
		return Integer.parseInt(sb.toString());
	}
	
	private int generateMin(char[] carray){
		Arrays.sort(carray);
//		System.out.println("sorted Min"+new String(carray));
		return Integer.parseInt(new String(carray));
	}
	
	public int difference(){
		return max - min;
	}
}