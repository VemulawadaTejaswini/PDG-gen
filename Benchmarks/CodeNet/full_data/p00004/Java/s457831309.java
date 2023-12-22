import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String line = br.readLine();
    	while(line!=null){
    		String[] lines = line.split(" ");
    		double a = Double.parseDouble(lines[0]);
    		double b = Double.parseDouble(lines[1]);
    		double c = Double.parseDouble(lines[2]);
    		double d = Double.parseDouble(lines[3]);
    		double e = Double.parseDouble(lines[4]);
    		double f = Double.parseDouble(lines[5]);
    		
    		double x = (c*e-f*b)/(a*e - d*b);
    		double y = (c-a*x)/b;
    		BigDecimal xx = new BigDecimal(x);
			xx = xx.setScale(3, BigDecimal.ROUND_HALF_UP);
    		BigDecimal yy = new BigDecimal(y);
			yy = yy.setScale(3, BigDecimal.ROUND_HALF_UP);
    		System.out.printf("%.3f",xx);
    		System.out.print(" ");
    		System.out.printf("%.3f",yy);
    		System.out.println("");
    		line = br.readLine();
    	}
	}
}