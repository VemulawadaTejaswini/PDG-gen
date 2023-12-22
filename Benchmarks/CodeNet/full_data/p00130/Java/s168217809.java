

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	class perser {

		String data;

		int ptr;



		perser(String data) {

			this.data = data;

			ptr = 0;

		}



		boolean hasNextCar() {

			if (ptr % 3 == 0) {

				return data.length() > ptr;

			}else{

				return false;

			}

		}



		boolean hasNextCommand() {

			if (ptr % 3 == 1) {

				return data.length() > ptr;

			}else{

				return false;

			}

		}



		int nextCommand(){

			int ret = 0;

			if(data.charAt(ptr) == '-'){

				ret = 1;

			}else{

				ret = -1;

			}

			ptr+=2;

			return ret;

		}

		Character nextCar(){

			return data.charAt(ptr++);

		}

	}



	void run() {

		int n = sc.nextInt();

		for (int z = 0; z < n; z++) {

			String data = sc.next();

			LinkedList<Character> fore = new LinkedList<Character>();

			LinkedList<Character> reer = new LinkedList<Character>();

			perser p = new perser(data);

			int now = 0;

			int min = 0;

			int max = 0;

			Character car = p.nextCar();

			fore.add(car);

			for(;p.hasNextCommand();){

				int cmd = p.nextCommand(); 

				now+=cmd;

				car = p.nextCar();

				if(min > now){

					min = now;

					reer.addFirst(car);

				}else if(max < now){

					max = now;

					fore.addLast(car);					

				}

			}

			String ret ="";

			for(Character c : reer){

				ret +=c;

			}

			for(Character c : fore){

				ret +=c;

			}

			System.out.println(ret);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}