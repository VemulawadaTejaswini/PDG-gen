import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;;){

			int n = sc.nextInt();

			if(n == 0)break;

			

			int[][] ms = new int[n][n];

			int posy = n/2+1;

			int posx = n/2;

			for(int i = 1 ; i < n*n+1;i++){

				int ny = posy+1;

				int nx = posx+1;

				if(ny >= n){

					ny = 0;

				}

				if(nx >= n){

					nx = 0;

				}

				for(;ms[ny][nx] != 0;){

					ny += 1;

					nx -= 1;

					if(ny >= n){

						ny = 0;

					}

					if(nx < 0){

						nx = n-1;

					}					

				}

				ms[ny][nx] = i;

				posx = nx;

				posy = ny;

			}

			for(int i =0;i < n;i++){

				for(int j = 0; j < n;j++){

					System.out.printf("%4d",ms[i][j]);				

				}

				System.out.println();

			}

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}