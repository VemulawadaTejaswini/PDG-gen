import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numData = Integer.parseInt(br.readLine());
		String[] input = null;
		for(int i = 0; i < numData; i++){
			input = br.readLine().split(" ");
			double xa = Double.parseDouble(input[0]);
			double ya = Double.parseDouble(input[1]);
			double ra = Double.parseDouble(input[2]);
			double xb = Double.parseDouble(input[3]);
			double yb = Double.parseDouble(input[4]);
			double rb = Double.parseDouble(input[5]);
			System.out.println(checkIntersection(xa, ya, ra, xb, yb, rb));
		}
	}

	public static final int A_INNER_B = -2;
	public static final int B_INNER_A = 2;
	public static final int CROSS = 1;
	public static final int OUTER = 0;
	public static final int WRONG = -100;
	
	public static int checkIntersection(double x1, double y1, double r1,
			double x2, double y2, double r2){
		int intersection = CROSS;
		int stat = 0;
		if((stat = judgeInner(x1, y1, r1, x2, y2, r2)) != WRONG){
			intersection = stat; 
		}else if((stat = judgeOuter(x1, y1, r1, x2, y2, r2)) != WRONG){
			intersection = stat;
		}
		return intersection;
	}
	
	private static int judgeInner(double x1, double y1, double r1,
			double x2, double y2, double r2){
		double lengthAB = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		if(lengthAB + r1 < r2)	return A_INNER_B;
		if(lengthAB + r2 < r1)	return B_INNER_A;
		return WRONG;
	}
	private static int judgeOuter(double x1, double y1, double r1, double x2, double y2, double r2){
		double lengthAB = (y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1);
		if(lengthAB > (r1 + r2) * (r1 + r2))	return OUTER;
		return WRONG;
	}
}