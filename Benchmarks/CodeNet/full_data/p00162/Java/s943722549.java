import java.io.*;
import java.util.*;
import java.math.*;


public class Main {
	Scanner sc = new Scanner(System.in);

	class score implements Comparable<score>{
		int id;
		int t;
		public int compareTo(score tar){
			return t - tar.t;
		}
		
		score(Scanner sc){
			id = sc.nextInt();
			t=0;
			t += sc.nextInt()*60+sc.nextInt();
			t += sc.nextInt()*60+sc.nextInt();
			t += sc.nextInt()*60+sc.nextInt();
			t += sc.nextInt()*60+sc.nextInt();
					
		}
		
	}
	
	void run() {
		
		boolean isH [] = new boolean[1000000];
		
		isH[0] = true;
		isH[1] = true;

		for(int i = 1; i < 1000000/2;i++){
			if(isH[i]){
				isH[i*2] = isH[i];
			}
		}
		for(int i = 1; i < 1000000/3;i++){
			if(isH[i]){
				isH[i*3] = isH[i];
			}
		}
		for(int i = 1; i < 1000000/5;i++){
			if(isH[i]){
				isH[i*5] = isH[i];
			}
		}
		int sum[] = new int[1000000];
		
		for(int i = 1; i < 1000000;i++){
			if(isH[i]){
				sum[i] = sum[i-1]+1;
			}else{
				sum[i] = sum[i-1];
			}
		}
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int m = sc.nextInt();
			
			System.out.println(sum[m]-sum[n-1]);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}