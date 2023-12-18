

import java.io.*;
import java.util.*;

public class Main {

	static int N = 0;
	static int[] TA = new int[2];
	static int[] H;
	
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			N = Integer.parseInt(br.readLine());
			TA = getArray(br.readLine());
			H = getArray(br.readLine());
		}
		
		double[] temps = Arrays.stream(H).mapToDouble(n -> Math.abs(TA[1] - (TA[0] - n * 0.006))).toArray();
		int min = 0;
		for(int i=0; i<temps.length; i++) {
			if(temps[i] < temps[min]) min = i;
		}
		System.out.println(min+1);
		
	}
	
	static int[] getArray(String s) {
		return Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
	}

	
}
