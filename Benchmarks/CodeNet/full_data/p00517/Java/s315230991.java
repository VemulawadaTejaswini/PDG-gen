import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int hx, hy, nx, ny,wcnt= 0;
		hx = sc.nextInt();
		hy = sc.nextInt(); 
		for(int i = 1; i < N; i++) {
			nx = sc.nextInt();
			ny = sc.nextInt();
			if(i == 0) {hx = nx; hy = ny;}
			int xg = hx - nx;
			int yg = hy - ny;
			xg = Math.abs(xg);
			yg = Math.abs(yg);
			if((hx <= nx && hy <= ny) || (hx >= nx && hy >= ny)) wcnt += Math.max(xg,yg);
			else wcnt += xg+yg;
		}
	System.out.println(wcnt);	
	}

}