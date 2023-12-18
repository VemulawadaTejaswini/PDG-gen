import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		class Spot {
			private int cx;
			private int cy;
			private int h;
			public Spot(int x, int y, int h) {
				super();
				this.cx = x;
				this.cy = y;
				this.h = h;
			}
			public int getX() {
				return cx;
			}
			public int getY() {
				return cy;
			}
			public int getH() {
				return h;
			}

		
		}

		List<Spot> spots = new ArrayList<Spot>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int h = sc.nextInt();
			spots.add(new Spot(x, y,h));
		}
		

		int H = 0;
		int cx = 0;
		int cy = 0;
		
		
		for (int j = 0; j < spots.size(); j++) {
			Spot spot = spots.get(j);

			if(spot.getH()==100){
				cx = spot.getX();
				cy = spot.getY();
				H = 100;
				break;
			}else if(spot.getH() > 0){
				//連立方程式を解く
			}
		}
		
		System.out.println(cx+" "+cy+" "+H);
	}
}
