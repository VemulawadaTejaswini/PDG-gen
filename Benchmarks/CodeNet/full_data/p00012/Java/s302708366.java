import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double ax,ay,bx,by,cx,cy,px,py,sitaAB = 0,sitaBC = 0,sitaCA = 0;

		while(scanner.hasNext()){
			ax = scanner.nextDouble();
			ay = scanner.nextDouble();
			bx = scanner.nextDouble();
			by = scanner.nextDouble();
			cx = scanner.nextDouble();
			cy = scanner.nextDouble();
			px = scanner.nextDouble();
			py = scanner.nextDouble();

			sitaAB = Math.acos(prod(ax-px, ay-py, bx-px, by-py) / (range(ax, ay, px, py) * range(bx, by, px, py)));
			sitaBC = Math.acos(prod(bx-px, by-py, cx-px, cy-py) / (range(bx, by, px, py) * range(cx, cy, px, py)));
			sitaCA = Math.acos(prod(cx-px, cy-py, ax-px, ay-py) / (range(cx, cy, px, py) * range(ax, ay, px, py)));
			if(equal((sitaAB + sitaBC + sitaCA), Math.PI*2)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

	public static double prod(double x1, double y1, double x2, double y2){
		return ((x1*x2) + (y1*y2));
	}
	public static double range(double x1, double y1, double x2, double y2){
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	}
	public static boolean equal(double a, double b){
		if((a-b) < 0.00000000001){
			return true;
		}else{
			return false;
		}
	}
}