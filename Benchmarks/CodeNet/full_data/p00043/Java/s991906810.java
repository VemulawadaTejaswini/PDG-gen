
import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	



	boolean rec(int[] unused){

		int sum = 0;

		boolean is2 = false;

//		System.out.println(Arrays.toString(unused));

		for(int i=1;i<10;i++){

			sum+=unused[i];

			is2 |= (unused[i]==2);

		}

		if(sum==2){

//			System.out.println();

			return is2;

		}

		

		for(int i=1;i<10;i++){

			if(unused[i]>2){

				unused[i] -= 3;

				if(rec(unused)){

					unused[i] += 3;

					return true;

				}

				unused[i] += 3;

			}

		}

		for(int i=1;i<=7;i++){

			if(unused[i]*unused[i+1]*unused[i+2] > 0){

				unused[i] -= 1;

				unused[i+1] -= 1;

				unused[i+2] -= 1;

				if(rec(unused)){

					unused[i] += 1;

					unused[i+1] += 1;

					unused[i+2] += 1;

					return true;

				}

				unused[i] += 1;

				unused[i+1] += 1;

				unused[i+2] += 1;

			}

		}

		return false;

	}

	boolean check(int[] used){

		for(int i=1;i<10;i++){

			if(used[i] > 4)

				return false;

		}

		return rec(used);

	}

	

	void run(){

		for(;sc.hasNextLine();){

			String buffer = sc.nextLine();

			int[] used = new int[10];

			for(int i= 0; i < 13;i++){

				used[buffer.charAt(i)-'0']++;

			}

			String ret = "";

			for(int i = 1;i<10;i++){

				used[i]++;

//				System.out.println(i);

				ret += check(used)?i+" ":"";

				used[i]--;

			}

			ret = ret.trim();

			if(ret.length() < 1){

				System.out.println("0");

			}else{

				System.out.println(ret);	

			}			

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}