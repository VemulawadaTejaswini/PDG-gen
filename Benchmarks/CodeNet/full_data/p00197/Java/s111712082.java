import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int cun = 0;
		int z = 1;
		while(x != 0 || y != 0){
			while(z != 0){
				z = x%y;
				x = y;
				y = z;
				cun++;
			}
			System.out.println(x + " " + cun);
			x = scan.nextInt();
			y = scan.nextInt();
			cun = 0;
			z = 1;
		}
	}
}