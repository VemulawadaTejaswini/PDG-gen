import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		double dis = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
		
		System.out.println(dis);
	}
}