import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		ArrayList<Double> x = new ArrayList<Double>();
		ArrayList<Double> y = new ArrayList<Double>();
		
		setInputs(x, y);
		
		System.out.println(getDistance(x, y));
	}
	
	public static double getDistance(ArrayList<Double> x, ArrayList<Double> y){
		double distanceX = getDistanceX(x.get(0), x.get(1));
		double squareX = distanceX * distanceX;
		
		double distanceY = getDistanceY(y.get(0), y.get(1));
		double squareY = distanceY * distanceY;
		
		return Math.sqrt(squareX + squareY);
	}
	
	private static double getDistanceX(double x1, double x2){
		double distanceX = x1 - x2;
		if(distanceX < 0){
			distanceX = distanceX * (-1);
		}
		return distanceX;
	}
	
	private static double getDistanceY(double y1, double y2){
		double distanceY = y1 - y2;
		if(distanceY < 0){
			distanceY = distanceY * (-1);
		}
		return distanceY;
	}
	
	private static void setInputs(ArrayList<Double> x, ArrayList<Double> y){
		Scanner sc = new Scanner(System.in);
		
		//P1ÌÀWðüÍ©çó¯æé
		x.add(sc.nextDouble());
		y.add(sc.nextDouble());
		
		//P2ÌÀWðüÍ©çó¯æé
		x.add(sc.nextDouble());
		y.add(sc.nextDouble());
	}
}