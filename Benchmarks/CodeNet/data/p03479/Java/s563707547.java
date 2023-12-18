

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		System.out.println((long) Math.floor(Math.log(y/x)/Math.log(2)) + 1);
	}
}
