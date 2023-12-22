//package atcoder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String [] args)  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[N];
		for(int i=0;i<N;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int count = 0;

		//System.out.println(x[1]);
		//System.out.println(y[1]);
		double kyori = 0;
		for(int j=0;j<N;j++) {
			kyori = Math.sqrt((Math.pow(x[j], 2)+Math.pow(y[j], 2)));
			//System.out.println(kyori);
			if(kyori<=D) {
				count ++;
			}
		}
		System.out.println(count);
		
	}
}