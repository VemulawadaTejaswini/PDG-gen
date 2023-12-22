//
//  HillsOfTop3.java
//  HillsOfTop3
//
//  Created by hajime on 14/03/30.
//  Copyright (c) 2014 __MyCompanyName__. All rights reserved.
//
import java.util.*;
import java.io.*;

class HillsOfTop3 {

	private static int[] mountain = new int[10];
	
    public static void main (String args[]) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			for (int i = 0; i < 10; i++) {
				mountain[i] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(mountain);
			
			for (int i = 9; i > 6; i--) {
				System.out.println(mountain[i]);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
    }
}