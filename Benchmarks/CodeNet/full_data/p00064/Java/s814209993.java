import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		int ans = 0;

		for(;sc.hasNext();){

			String buffer = sc.next();

//			if(buffer.equals("ateer")) break;

			String rM = "";

			for(char c:buffer.toCharArray()){

				if(!Character.isDigit(c)){

					c=' ';

				}

				rM += c;

			}

			Scanner in = new Scanner(rM);

			for(;in.hasNextInt();){

				ans += in.nextInt();

			}

		}

		System.out.println(ans);

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}