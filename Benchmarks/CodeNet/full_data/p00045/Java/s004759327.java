import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int sum2 = 0;
		while(stdIn.hasNext()) {
			count++;
			String[] in = stdIn.next().split(",");
			int a = Integer.parseInt(in[0]);
			int b = Integer.parseInt(in[1]);
			sum += a*b;
			sum2 += b;
		}
		System.out.println(sum);
		double ave = sum2/(double)count*10;
		if(ave%10 >= 5) {
			ave += 10-ave%10;
		}
		else {
			ave -= (ave*10)%10;
		}
		ave /=10;
		
		System.out.println((int)ave);
	}
}