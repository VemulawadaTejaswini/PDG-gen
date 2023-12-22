import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = br.readLine();
			String[] str = line.split("");
			int sum = 0;
			if ("0".equals(str[0])){break;}
			for (int i = 0 ; i < str.length ; i++ ) {
				sum += Integer.parseInt(str[i]);
			}
		System.out.println(sum);
		}
	}
}