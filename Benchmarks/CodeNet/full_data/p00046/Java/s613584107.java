import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Double> ans = new ArrayList<Double>();
		
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			ans.add(Double.parseDouble(s));
			
		}
		
		for (int i = 0; i < ans.size(); i++) {
			max = Math.max(ans.get(i), max);
			min = Math.min(ans.get(i), min);
		}
		
		System.out.println(max - min);
	}
	
}