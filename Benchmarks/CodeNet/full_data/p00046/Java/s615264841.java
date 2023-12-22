import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MaxMinManager manager = new MaxMinManager();
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			double input = Double.parseDouble(str);
			manager.addValue(input);
		}
		
		System.out.printf("%.1f\n", manager.difference());
	}

}

class MaxMinManager {
	double max = Double.MIN_VALUE;
	double min = Double.MAX_VALUE;
	
	public void addValue(double d){
		if(d > max){
			max = d;
		}
		
		if(d < min){
			min = d;
		}
	}
	
	public double difference() {
		return max - min;
	}
}