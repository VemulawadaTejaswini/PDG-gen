import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	double calc(int a,int b){

		return Math.sqrt((a+b)*(a+b) - (a-b)*(a-b));

	}

	

	void run(){

		for(;sc.hasNextLine();){

			Scanner in = new Scanner(sc.nextLine());

			int boxSize = in.nextInt();

			LinkedList<Integer> data = new LinkedList<Integer>();

			for(;in.hasNextInt();){

				data.push(in.nextInt());

			}			

			double[][] dp = new double[1<<data.size()][data.size()];

			for(int i = 1 ; i< 1<<data.size(); i++){

				Arrays.fill(dp[i], Double.MAX_VALUE);

			}

			for(int i =0; i < data.size(); i++){

				dp[1<<i][i] = data.get(i);

			}

			for(int i = 1; i< 1<<data.size(); i++){

				for(int j = 0; j < data.size();j++){

					int sh = 1<<j;

					if((i & sh) != 0){

						continue;

					}

					for(int k = 0; k < data.size();k++){

						dp[i|sh][j] = Math.min(dp[i][k] + calc(data.get(j),data.get(k)),dp[i|sh][j]);		

					}

				}

			}

			double min = Double.MAX_VALUE;

			for(int i = 0; i < data.size();i++){

				dp[(1<<data.size()) - 1][i] += data.get(i);

				min = Math.min(min, dp[(1<<data.size())-1][i]);

			}

			System.out.println(min < boxSize+1e-8 ? "OK":"NA");

		}		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}