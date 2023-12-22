import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, i;
		double data[];

		for(;;){
			double ave = 0, d = 0;
			n = sc.nextInt();
			if(n == 0){
				break;
			}
			data = new double[n];
			for(i = 0; i < n; i++){
				data[i] = sc.nextInt();
				ave += data[i];
			}
			ave /= n;

			for(i = 0; i < n; i++){
				data[i] -= ave;
				d += data[i] * data[i];
			}
			d /= n;
			System.out.println(String.format("%.10f", Math.sqrt(d)));	
		}
	}
}