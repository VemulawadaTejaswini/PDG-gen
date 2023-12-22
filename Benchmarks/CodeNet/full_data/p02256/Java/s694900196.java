import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = (br.readLine()).split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		int x,y;
		if (a>b) {
			x = a;
			y = b;
		}else{
			x = b;
			y = a;
		}
		int work;
		while(x%y != 0) {
			work = y;
			y = x%y;
			x = work;
		}
		System.out.println(y);
	}
}