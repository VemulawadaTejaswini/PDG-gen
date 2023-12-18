package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MysteriousLight {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int x = Integer.parseInt(s[1]);
		int result = (n-x);
		
		while(true){
			int current = x;
			x=(n-x)%x;
			n = current;
			
			if(x == 0){break;}
			result += x;
		}
		result*=3;
		System.out.println(result);
	}

}
