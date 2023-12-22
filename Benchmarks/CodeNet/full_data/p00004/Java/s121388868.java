import java.io.*;
import java.util.*;

public class  Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			
			// x = (ace-bcd - abf + bdc)/(a^2???e - abd)
			// y = (af-dc)/(ae-bd)
			double x = (a*c*e-b*c*d-a*b*f+b*d*c) / (a*a*e-a*b*d);
			double y = (a*f-d*c)/(a*e-b*d);
			
			if (x == 0) x=0;
			if (y == 0) y=0;
			
			String strX = String.format("%.3f", x);
			String strY = String.format("%.3f", y);
			
			System.out.println(strX + " " + strY);
		}
	}
}