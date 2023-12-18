package petal;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		while( x>9 || x<1 || y>9 || y<1 || z<1 || z>9)
		{
			x = sc.nextInt();
			y= sc.nextInt();
			z= sc.nextInt();
		}
		String xy= Integer.toString(x) + Integer.toString(y) + Integer.toString(z);
		int yz= Integer.valueOf(xy);
		if(yz%4==0) {
		System.out.print("YES");
		}else {
		System.out.print("NO");
		}
		sc.close();

	}
}
