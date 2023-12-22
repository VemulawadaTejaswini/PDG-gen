

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int[] fibo = new int[50];
	
	public static void fibo(){
		fibo[0] = 1;
		fibo[1] = 1;
		for(int i=2; i<49; i++)
			fibo[i] = fibo[i-1] + fibo[i-2];
	}
	
	static{ Arrays.fill(fibo, 0); }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		fibo();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int index = sc.nextInt();
			System.out.println(fibo[index]);
			//System.out.println("\n");
		}
	}
}