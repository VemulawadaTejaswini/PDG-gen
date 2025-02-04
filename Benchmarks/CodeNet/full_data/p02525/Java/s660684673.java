import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) throws IOException{
		int n = 0;
		double m = 0;
		double sigma = 0;
		double alpha =0;
		ArrayList<Double> s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			m = 0;
			sigma = 0;
			alpha = 0;
			n = Integer.parseInt(br.readLine());
			if(n == 0){
				break;
			}
			s = new ArrayList<Double>();
			String str[] = br.readLine().split(" ");
			for(int i=0; i<str.length; i++){
				s.add(Double.parseDouble(str[i]));
			}
			
			
			m = ave(s);
			
			for(int i=0; i<s.size(); i++){
				sigma += (s.get(i) - m) * (s.get(i) - m);
			}
			
			alpha = Math.sqrt(sigma / n);
			System.out.printf("%.5f\n", alpha);
		}
	}
	
	public static double ave (ArrayList<Double> s){
		double sum =0;
		
		for(int i=0; i<s.size(); i++){
			sum += s.get(i);
		}
		
		return (sum / s.size());
	}
}