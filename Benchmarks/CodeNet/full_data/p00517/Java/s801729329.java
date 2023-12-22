import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
		sc.nextInt();
		int n = sc.nextInt();
		int cost = 0;
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		for(int i=1;i<n;i++){
			int px = sc.nextInt();
			int py = sc.nextInt();
			int gx = px-sx;
			int gy = py-sy;
			cost += Math.abs(gx-gy);
			if(gx*gy>=0) cost += Math.min(Math.abs(gx), Math.abs(gy));
			sx = px;
			sy = py;
		}
		System.out.println(cost);
	}

}