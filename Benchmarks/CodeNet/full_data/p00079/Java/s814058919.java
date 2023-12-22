import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = null;
		List<Double> point = new ArrayList<Double>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				String[] s = str.split(",");
				double x = Double.parseDouble(s[0]);
				double y = Double.parseDouble(s[1]);
				point.add(x);
				point.add(y);
			}
			double sum = 0;
			for(int i = 2; i < point.size()/2; i++){
				double x = point.get(2*i)-point.get(0);
				double y = point.get(2*i+1)-point.get(1);
				double a = Math.sqrt(x*x+y*y);
				x = point.get(2*i-2)-point.get(0);
				y = point.get(2*i-1)-point.get(1);
				double b = Math.sqrt(x*x+y*y);
				x = point.get(2*i-2)-point.get(2*i);
				y = point.get(2*i-1)-point.get(2*i+1);
				double c = Math.sqrt(x*x+y*y);
				double z = (a+b+c)/2;
				sum += Math.sqrt(z*(z-a)*(z-b)*(z-c));
			}
			System.out.printf("%.6f", sum);
		} finally {
			if( stdIn != null){
				stdIn.close();
			}
		}
	}
}