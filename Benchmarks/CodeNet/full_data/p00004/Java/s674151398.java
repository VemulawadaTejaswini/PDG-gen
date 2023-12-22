//
//  SimultaneousEquation.java
//  SimultaneousEquation
//
//  Created by hajime on 14/04/29.
//  Copyright (c) 2014 __MyCompanyName__. All rights reserved.

import java.util.*;
import java.io.*;
import java.text.*;

public class Main {

    public static void main (String args[]) {
        
		double x = 0.0;
		double y = 0.0;
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			
			while ((line = br.readLine()) != null) {
				String[] str = line.split(" ");
				
				if (str.length == 6) {
					double a = Double.parseDouble(str[0]);
					double b = Double.parseDouble(str[1]);
					double c = Double.parseDouble(str[2]);
					double d = Double.parseDouble(str[3]);
					double e = Double.parseDouble(str[4]);
					double f = Double.parseDouble(str[5]);
					
					x = (b*f - c*e)/(b*d - a*e);
					y = (c*d - a*f)/(b*d - a*e);
					
					//NumberFormat format = NumberFormat.getInstance();
					//format.setMaximumFractionDigits(4);
					
					
					
					System.out.println(format.format(x) + " " + format.format(y));
					
				}else {
					System.exit(0);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		finally {
			System.exit(0);
		}
    }
}