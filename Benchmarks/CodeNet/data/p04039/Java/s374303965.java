

import java.awt.font.FontRenderContext;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static int n ;
public static int k ;
public static boolean []d = new boolean [k+1];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			for (int i = 1; i <=k; i++) {
				d[scan.nextInt()] = true;
			}
			while (n>0) {
				if (panduan(n)) {
					System.out.println(n);
					break;
				}
				++n;
			}
		}
	}
	public static boolean  panduan (int n) {
		 while(n>0)
		    {
		        if(d[n%10]) return false;
		        n /= 10;
		    }
		
		return true;
	}
}
