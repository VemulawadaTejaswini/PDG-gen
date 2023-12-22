import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		int ans = 0;

		for(;sc.hasNextLine();){

			String buffer = sc.nextLine();

			int len = buffer.length();

			boolean ret = true;

			for(int i= 0; i < len;i++){

				if(buffer.charAt(i) != buffer.charAt(len-i-1)){

					ret = false;

				}

			}

			if(ret) ans++;

		}

		System.out.println(ans);

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}