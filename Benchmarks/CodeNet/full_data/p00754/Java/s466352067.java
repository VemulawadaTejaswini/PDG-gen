package _1173;

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	String trim(String tar){
		String ret = "";
		for(char ch:tar.toCharArray()){
			if("()[]".indexOf(ch) >=0){
				ret += "()[]".indexOf(ch);
			}
		}
		return ret;
	}
	void run() {
		for (;;) {
			String buffer = sc.nextLine();
			if (buffer.equals(".")) {
				break;
			}
			buffer = trim(buffer);
			
			for(int i =0 ;i < 50;i++){
				buffer = buffer.replace("01","");
				buffer = buffer.replace("23","");
			}
			boolean ok = buffer.length ==0;
			System.out.println(ok?"yes":"no");
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}