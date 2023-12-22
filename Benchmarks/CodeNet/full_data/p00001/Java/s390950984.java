package no_001;

import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] a){

		ArrayList<Integer> inputs = new ArrayList<Integer>(); 
		String line;

		try {
			int count=0;
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				while ((line = br.readLine()) != null&&line.length()>0) {
						inputs.add(Integer.parseInt(line));
					count++;
					if (count>9) {
						break;
					}
				}
		} catch (Exception e) {
		}
		int sub = 0;
		for(int k=0;k<inputs.size()-1;k++){
			for (int i = k+1; i < inputs.size(); i++) {
				try{
					int num1 = inputs.get(k);
					int num2 = inputs.get(i);
					if (num1<num2) {
						sub = num2;
						inputs.set(i,num1);
						inputs.set(k, sub);
					}
				}catch(Exception e){
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			if(i<inputs.size()){
				System.out.println(inputs.get(i));
			}
		}
	}
}