import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static String a;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		if(x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		
		int ans = gcd(x,y);
		System.out.println(ans);
	}
	public static int gcd(int x, int y) {
		if(x == 0) return y;
		if(x == y) return x;
		return gcd(y%x,x);
	}
}