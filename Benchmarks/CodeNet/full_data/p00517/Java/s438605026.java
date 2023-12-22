
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
			if(nx > W || ny > H) break;
			if(i == 0) {hx = nx; hy = ny;}
			int xg = Math.abs(hx - nx);
			int yg = Math.abs(hy - ny);
			if((hx <= nx && hy <= ny) || (hx >= nx && hy >= ny)) wcnt += Math.max(xg,yg);
			else wcnt += xg+yg;
		}
	System.out.println(wcnt);	
	}

}