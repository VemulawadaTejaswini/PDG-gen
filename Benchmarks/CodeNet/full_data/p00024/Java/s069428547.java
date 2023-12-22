import java.util.*;
import java.text.*;
import java.math.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			double v = in.nextDouble();
			double h = v*v/98+1;
			DecimalFormat fm = new DecimalFormat("#");
			fm.setRoundingMode(RoundingMode.HALF_UP);
			System.out.println(fm.format(h));
		}
	}
}