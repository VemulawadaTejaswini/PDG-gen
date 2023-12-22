import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		int[] ans = new int[1<<11];

		int[] bitNum = new int[1<<11];

		ans[0] = 0;

		for(int i = 0; i < 1<<10;i++){

			for(int j = 1, k =0; j < 1<<11 && k< 10; j = j <<1 , k++){

				if((i&j) == 0){

					ans[i|j] = ans[i]+ k;

					bitNum[i|j] = bitNum[i]+1;

				}

			}

		}

		

		for(;;){

			int n = sc.nextInt();

			int s = sc.nextInt();

			if((n|s) == 0){

				break;

			}

			int count = 0;

			for(int i =0; i < 1<<11;i++){

				if(bitNum[i] == n && ans[i] == s){

//					System.out.println(i);

					count ++;

				}

			}

			System.out.println(count);

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}