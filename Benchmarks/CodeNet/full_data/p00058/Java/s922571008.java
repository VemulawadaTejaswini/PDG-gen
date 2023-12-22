import java.awt.geom.Line2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			String[] tmpArray = str.split(" ");
			double[] input = new double[8];
			for(int i = 0; i < input.length ; i++){
				input[i] = Double.parseDouble(tmpArray[i]);
			}
			
			Line2D.Double l1 = new Line2D.Double(input[0], input[1], input[2], input[3]);
			Line2D.Double l2 = new Line2D.Double(input[4], input[5], input[6], input[7]);
			
			if(ProductCalculator.isOrthogonal(l1, l2)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

}

class ProductCalculator {
	public static double crossProduct(Line2D.Double l1, Line2D.Double l2){
		Vector2D v1 = new Vector2D(l1);
		Vector2D v2 = new Vector2D(l2);
		
		return v1.x*v2.y - v1.y*v2.x;
	}
	
	public static double innerProduct(Line2D.Double l1, Line2D.Double l2){
		Vector2D v1 = new Vector2D(l1);
		Vector2D v2 = new Vector2D(l2);
		
		return v1.x*v2.x + v1.y*v2.y;
	}
	
	public static double innerProduct(Vector2D v1, Vector2D v2){
		
		return v1.x*v2.x + v1.y*v2.y;
	}
	
	public static boolean isOrthogonal(Line2D.Double l1, Line2D.Double l2){
		Vector2D v1 = new Vector2D(l1);
		Vector2D v2 = new Vector2D(l2);
		
		if(v1.isZero() || v2.isZero()){
			return false;
		}
		
		if(innerProduct(v1, v2) == 0){
			return true;
		}
		else {
			return false;
		}
	}
}

class Vector2D {
	double x;
	double y;
	
	public Vector2D (Line2D.Double l){
		x = l.x2 - l.x1;
		y = l.y2 - l.y1;
	}
	
	public boolean isZero(){
		if(x == 0 && y == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
}