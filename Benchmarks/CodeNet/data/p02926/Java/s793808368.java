import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		YX[] e = new YX[N];
    		for (int i=0; i<N; i++) {
    			int x = sc.nextInt();
    			int y = sc.nextInt();
    			e[i] = new YX(y, x);
    		}

    		YX dai1 = new YX(0, 0);
    		YX dai2 = new YX(0, 0);
    		YX dai3 = new YX(0, 0);
    		YX dai4 = new YX(0, 0);

    		for (int i=0; i<N; i++) {
    			if (e[i].x >= 0 && e[i].y >= 0 || e[i].x + e[i].y >= 0) {
        			double sqx = dai1.x + e[i].x;
        			sqx *= sqx;
        			double sqy = dai1.y + e[i].y;
        			sqy *= sqy;
        			if (Math.sqrt(sqx + sqy) > Math.sqrt(dai1.x*dai1.x + dai1.y*dai1.y)) {
        				dai1.x += e[i].x;
        				dai1.y += e[i].y;
        			}
    			}
    			if (e[i].x <= 0 && e[i].y >= 0 || -e[i].x + e[i].y >= 0) {
        			double sqx = dai2.x + e[i].x;
        			sqx *= sqx;
        			double sqy = dai2.y + e[i].y;
        			sqy *= sqy;
        			if (Math.sqrt(sqx + sqy) > Math.sqrt(dai2.x*dai2.x + dai2.y*dai2.y)) {
        				dai2.x += e[i].x;
        				dai2.y += e[i].y;
        			}
    			}
    			if (e[i].x <= 0 && e[i].y <= 0 || -e[i].x + -e[i].y >= 0) {
        			double sqx = dai3.x + e[i].x;
        			sqx *= sqx;
        			double sqy = dai3.y + e[i].y;
        			sqy *= sqy;
        			if (Math.sqrt(sqx + sqy) > Math.sqrt(dai3.x*dai3.x + dai3.y*dai3.y)) {
        				dai3.x += e[i].x;
        				dai3.y += e[i].y;
        			}
    			}
    			if (e[i].x >= 0 && e[i].y <= 0 || e[i].x + -e[i].y >= 0) {
        			double sqx = dai4.x + e[i].x;
        			sqx *= sqx;
        			double sqy = dai4.y + e[i].y;
        			sqy *= sqy;
        			if (Math.sqrt(sqx + sqy) > Math.sqrt(dai4.x*dai4.x + dai4.y*dai4.y)) {
        				dai4.x += e[i].x;
        				dai4.y += e[i].y;
        			}
    			}
    		}

			double max = 0;
			if (max < Math.sqrt(dai1.x*dai1.x + dai1.y*dai1.y)) {
				max = Math.sqrt(dai1.x*dai1.x + dai1.y*dai1.y);
			}
			if (max < Math.sqrt(dai2.x*dai2.x + dai2.y*dai2.y)) {
				max = Math.sqrt(dai2.x*dai2.x + dai2.y*dai2.y);
			}
			if (max < Math.sqrt(dai3.x*dai3.x + dai3.y*dai3.y)) {
				max = Math.sqrt(dai3.x*dai3.x + dai3.y*dai3.y);
			}
			if (max < Math.sqrt(dai4.x*dai4.x + dai4.y*dai4.y)) {
				max = Math.sqrt(dai4.x*dai4.x + dai4.y*dai4.y);
			}
			System.out.println(max);


    	} finally {
    		sc.close();
    	}
    }
}

class YX {
	public double y;
	public double x;
	public YX(double y, double x) {
		this.y = y;
		this.x = x;
	}

	public String toString() {
		return "[" + y + "," + x + "]";
	}
}
