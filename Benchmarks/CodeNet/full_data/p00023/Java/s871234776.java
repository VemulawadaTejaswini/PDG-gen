import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer tk;
		double x1, y1, r1, x2, y2, r2;
		for (int i = 0; i < n; i ++) {
			tk = new StringTokenizer(in.readLine());
			x1 = Double.parseDouble(tk.nextToken());
			y1 = Double.parseDouble(tk.nextToken());
			r1 = Double.parseDouble(tk.nextToken());
			x2 = Double.parseDouble(tk.nextToken());
			y2 = Double.parseDouble(tk.nextToken());
			r2 = Double.parseDouble(tk.nextToken());
			//test a in b
			//center of 2 times r1  < r2 and 
			if (Math.pow(Math.pow(x1-x2,2) + Math.pow(y1-y2,2),.5) + r1 <= r2)
			//if (x1 + r1 <= x2 + r2 && x1 - r1 >= x2 - r2 && y1 + r1 <= y2 + r2 && y1 - r1 >= y2 - r2) 
				System.out.println("-2");
			
			if (Math.pow(Math.pow(x1-x2,2) + Math.pow(y1-y2,2),.5) + r2 <= r1)
			//else if (x1 + r1 >= x2 + r2 && x1 - r1 <= x2 - r2 && y1 + r1 >= y2 + r2 && y1 - r1 <= y2 - r2) 
				System.out.println("2");
			
			//if distance btwen centers is greater then 2(r1 + r2)
			else if (Math.pow(Math.pow(x1-x2,2) + Math.pow(y1-y2,2),.5) <= (r1+r2)) 
				System.out.println("1");
			
			else 
				System.out.println("0");
		}
		
	}

}