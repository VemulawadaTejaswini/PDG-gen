

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		int n=Integer.valueOf(sc.nextLine());

		for(int i =0; i < n;i++){

			System.out.println(sc.nextLine().replace("Hoshino", "Hoshina"));

		}		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}