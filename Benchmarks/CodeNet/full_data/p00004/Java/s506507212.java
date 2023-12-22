import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			double preX,preY,newX,newY;
			String[] s = sc.nextLine().split("[\\s]+");
			int[] data = new int[s.length];
			for(int i=0;i<s.length;i++){
				data[i] = Integer.parseInt(s[i]);
			}
			
			preX = (((data[2]*data[4])-(data[1]*data[5])) / ((data[0]*data[4])-(data[1]*data[3])));
			preY = (((data[0]*data[5])-(data[2]*data[3])) / ((data[0]*data[4])-(data[1]*data[3])));
			
			newX = new BigDecimal(preX).setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
			newY = new BigDecimal(preY).setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
			
			if(newX == -0.0) newX = 0.0;
			if(newY == -0.0) newY = 0.0;
			
			System.out.println(newX+" "+newY);
		}
	}
}