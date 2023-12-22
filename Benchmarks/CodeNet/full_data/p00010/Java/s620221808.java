import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	
	public static final int X = 0;
	public static final int Y = 1;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();
		//test();
	}
	public static void test(){
		double pi = 3.141592;
		System.out.println(pi);
		pi = (double)Math.round(pi * 1000) / 1000;
		System.out.println(pi);
	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			double[][] pos = new double[3][2];
			
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 2; k++){
					pos[j][k] = sc.nextDouble();
				}
			}
			//abとbcの傾きを求める
			double[] a = new double[2];

			for(int j = 0; j < 2; j++){
				a[j] = (pos[j + 1][Y] - pos[j][Y]) / (pos[j + 1][X] - pos[j][X]);
				//System.out.println(a[j]);
			}
			//それらの垂直を求める
			for(int j = 0; j < 2; j++){
				a[j] = -1 / a[j];
				//System.out.println("a[" + j + "] = " + a[j]);
			}
			//垂直二等分線の高さを求める
			double[] b = new double[2];
			double[][] pos2 = new double[2][2];
			for(int j = 0; j < 2; j++){
				//b = y - ax
				pos2[j][X] = (pos[j][X] + pos[j + 1][X]) / 2;
				pos2[j][Y] = (pos[j][Y] + pos[j + 1][Y]) / 2;
				b[j] = pos2[j][Y] - a[j] * pos2[j][X];
				//System.out.println("b[" + j + "] = " + b[j]);
			}
			double xp;
			double yp;
			if(Math.abs(b[1]) == Double.POSITIVE_INFINITY){
				xp = pos2[1][X];
				yp = a[0]*xp + b[0];
			}
			else if(Math.abs(b[0]) == Double.POSITIVE_INFINITY){
				xp = pos2[0][X];
				yp = a[1]*xp + b[1];
			}
			else{
				//xp = (b2 - b1) / (a1 - a2)
				xp = (b[1] - b[0]) / (a[0] - a[1]);
				yp = a[0] * xp + b[0];
				
			}
			double r = Math.sqrt(Math.pow(pos[0][X] - xp, 2) + Math.pow(pos[0][Y] - yp, 2));
			
			//xp,yp,rを丸める
			r = (double)Math.round(r * 1000) / 1000;
			
			//System.out.println(xp + " " + yp + " " + r);
			if(xp == -0){
				xp *= -1;
			}
			if(yp == -0){
				yp *= -1;
			}
			if(r == -0){
				r *= -1;
			}
			System.out.printf("%.3f %.3f %.3f", xp,yp,r);
		}
	}
}