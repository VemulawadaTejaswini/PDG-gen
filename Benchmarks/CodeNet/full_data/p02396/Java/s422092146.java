

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Case i:" + scan.nextLong());
		}while(scan.nextLong() != 0);
	}
}