import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()) {
			Rectangle r1 = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			Rectangle r2 = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

			System.out.println(hasIntersection(r1, r2)? "YES": "NO");
		}
		sc.close();
	}
	
	static boolean hasIntersection(Rectangle r1, Rectangle r2) {
		boolean LR_r1r2r1 = (r1.left <= r2.left && r2.left <= r1.right) || (r1.left <= r2.right && r2.right <= r1.right);
		boolean LR_r2r1r2 = (r2.left <= r1.left && r1.left <= r2.right) || (r2.left <= r1.right && r1.right <= r2.right);
		boolean UD_r1r2r1 = (r1.down <= r2.down && r2.down <= r1.up) || (r1.down <= r2.up && r2.up <= r1.up);
		boolean UD_r2r1r2 = (r2.down <= r1.down && r1.down <= r2.up) || (r2.down <= r1.up && r1.up <= r2.up);
		
		return (LR_r1r2r1 || LR_r2r1r2) && (UD_r1r2r1 || UD_r2r1r2);
	}
}

class Rectangle{
	double left;
	double right;
	double up;
	double down;
	
	Rectangle(double ldx, double ldy, double rux, double ruy){
		this.left = ldx;
		this.right = rux;
		this.up = ruy;
		this.down = ldy;
	}
}