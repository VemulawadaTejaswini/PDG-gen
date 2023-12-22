import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		double[] p1 = {0, 0}, p2 = {100, 0};
		System.out.println(p1[0] + " " + p1[1]);
		koch(n, p1, p2);
		System.out.println(p2[0] + " " + p2[1]);
		
		scanner.close();
	}
	
	public static void koch(int d, double[] p1, double[] p2) {
		if(d == 0) return;
		
		double[] s = new double[2];
		double[] u = new double[2];
		double[] t = new double[2];
		
		s[0] = (p1[0] * 2 + p2[0] * 1) / 3;
		s[1] = (p1[1] * 2 + p2[1] * 1) / 3;
		t[0] = (p1[0] * 1 + p2[0] * 2) / 3;
		t[1] = (p1[1] * 1 + p2[1] * 2) / 3;
		
		u[0] = (t[0] - s[0]) * Math.cos(Math.PI / 3) - (t[1] - s[1]) * Math.sin(Math.PI / 3) + s[0];
		u[1] = (t[0] - s[0]) * Math.sin(Math.PI / 3) + (t[1] - s[1]) * Math.cos(Math.PI / 3) + s[1];
		
		koch(d - 1, p1, s);
		System.out.println(s[0] + " " + s[1]);
		koch(d -1, s, u);
		System.out.println(u[0] + " " + u[1]);
		koch(d -1, u, t);
		System.out.println(t[0] + " " + t[1]);
		koch(d - 1, t, p2);
	}
} 

