/* 
 * ???????????§??????????´? Test.java
 *
 * Copyright(C) 2016 Nagasaki Team All Rights Reserved.
 */
/**
 * 
 *
 * @author Chikara
 * @version 1.00
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	/* main???????????? */
	public static void main(String[] args) throws IOException{
		String str = null;
		int count = 1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		
		while(!str.equals("0")){
			System.out.println("Case "+ count +": " + str);
			count++;
			str = br.readLine();
		}
	}
}