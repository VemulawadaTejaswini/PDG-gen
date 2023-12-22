

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void p(String s){

		System.out.println(s);

	}

	void run(){

		for(;sc.hasNextDouble();){

			double d =sc.nextDouble();

			if(d<=48){

				p("light fly");

			}else if(d <= 51){

				p("fly");

			}else if(d <= 54){

				p("bantam");

			}else if(d <= 57){

				p("feather");

			}else if(d <= 60){

				p("light");

			}else if(d <= 51){

				p("fly");

			}else if(d<=64){

				p("light welter");

			}else if(d<=69){

				p("welter");

			}else if(d<=75){

				p("light middle");

			}else if(d<=81){

				p("middle");

			}else if(d<=91){

				p("light heavy");

			}else{

				p("heavy");

			}

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}