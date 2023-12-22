import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    
	    double A = sc.nextDouble(); // 辺
	    double B = sc.nextDouble(); // 辺
	    double H = sc.nextDouble(); // 時
	    double M = sc.nextDouble(); // 分
	    
	    double angle = 90;  // 角度
	    double h = (H * 30) + (M * 0.5);
	    double s = M * 6;
	    if (h > s) {
	      angle = h - s;
	    } else if (h < s) {
	      angle = s - h;
	    }
	    
	    // 残りの辺の長さ
	    double side = Math.sqrt(Math.pow(A,2)+Math.pow(B,2)-2*A*B*Math.cos(Math.toRadians(angle)));

	    System.out.println(side);
	    
	  }
}