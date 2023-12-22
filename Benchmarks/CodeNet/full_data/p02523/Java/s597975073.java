import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x1, y1, x2, y2, distanceX, distanceY, result;
		
		String str[] = br.readLine().split(" ");
			x1 = Double.parseDouble(str[0]);
			y1 = Double.parseDouble(str[1]);
			x2 = Double.parseDouble(str[2]);
			y2 = Double.parseDouble(str[3]);
			
			distanceX = reminder(x1, x2);
			distanceY = reminder(y1, y2);
			result = Math.sqrt((distanceX * distanceX) + (distanceY * distanceY));
			
			System.out.println(result);
			
        }

	public static double reminder(double a, double b){
		if(a >= b){
			return (a-b);
		}
	
		else{
			return (b-a);
		}
	}
}