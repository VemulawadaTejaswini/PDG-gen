import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;sc.hasNextLine();){

			String buffer = sc.nextLine();

			String token[] = buffer.replace('=', ' ').replace('+', ' ').split(" ");

			int ret = -1;

			for(int i=0;i <10;i++){

				int a = Integer.valueOf(token[0].replace('X', (char)(i+'0')));

				int b = Integer.valueOf(token[1].replace('X', (char)(i+'0')));

				int c = Integer.valueOf(token[2].replace('X', (char)(i+'0')));

				if(a+b==c){

					ret = i;

				}

			}

			System.out.println(ret==-1?"NA":ret);

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}