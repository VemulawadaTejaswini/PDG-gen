import java.io.*;
import java.math.BigDecimal;
import java.util.*;


public class Main {
	static int[] vy = {1,0,-1,0};
	static int[] vx = {0,1,0,-1};
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int W = sc.nextInt();
			int H = sc.nextInt();
			int D = 0;
			if(W == 0 && H == 0) break;
			int w = 1;
			int h = 1;
			while(true) {
				String in = sc.next();
				if(in.equals("FORWARD")) {
					int idx = sc.nextInt();
					w = Math.min((w + vx[D]*idx),W);
					h = Math.min((h + vy[D]*idx),H);
				}
				if(in.equals("BACKWARD")) {
					int idx = sc.nextInt();
					w = Math.max((w - vx[D]*idx),1);
					h = Math.max((h - vy[D]*idx),1);
				}
				if(in.equals("RIGHT")) {
					D = (D+1) % 4;
				}
				if(in.equals("LEFT")) {
					D = (D+3) % 4;
				}
				if(in.equals("STOP")) {
					break;
				}
			}
			System.out.println(w + " " + h);
			
			
		}
	}
}