import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;;){

			int n = sc.nextInt();

			if(n == 0)break;

			HashMap<Character,Character> map = new HashMap<Character,Character>();

			for(int i = 0; i < n; i++){

				map.put(sc.next().charAt(0),sc.next().charAt(0));

			}

			n  = sc.nextInt();

			String ret = "";

			for(int i = 0; i < n; i++){

				char ch  = sc.next().charAt(0);

				if(map.containsKey(ch)){

					ret += map.get(ch);

	//				map.remove(ch);

				}else{

					ret += ch;

				}

			}

			

			System.out.println(ret);

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}