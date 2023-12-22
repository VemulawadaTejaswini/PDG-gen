import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = br.readLine();
			int x = Integer.parseInt(line);
			if (x == 0){break;}
			int sum;
			while(x > 0){
				int y = x;
				y = y/10;
				y = y*10;
				sum += (x-y) ;
				x = (y/10);
			}
			System.out.println(sum);
		}
	}
}