import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0021_Parallelism {
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int problemCount = Integer.parseInt(reader.readLine());
			for(int i = 0; i < problemCount; i++) {
				String[] textArray = reader.readLine().split(" ");
				GeometricVector vector1 = new GeometricVector(Double.parseDouble(textArray[0]), Double.parseDouble(textArray[1]), 
																Double.parseDouble(textArray[2]), Double.parseDouble(textArray[3]));
				GeometricVector vector2 = new GeometricVector(Double.parseDouble(textArray[4]), Double.parseDouble(textArray[5]), 
																Double.parseDouble(textArray[6]), Double.parseDouble(textArray[7]));
																
				if(vector1.isParallelTo(vector2)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


}
class GeometricVector {
	private double xlength;
	private double ylength;
	
	GeometricVector(double x1, double y1, double x2, double y2) {
		xlength = x2 - x1;
		ylength = y2 - y1;
	}
	boolean isParallelTo(GeometricVector otherVector) {
		double otherXlength = otherVector.getXlength();
		double otherYlength = otherVector.getYlength();
		
		if(getXlength() * otherYlength - getYlength() * otherXlength == 0) {
			return true;
		} else {
			return false;
		}
	}
	double getXlength() {
		return xlength;
	}
	double getYlength() {
		return ylength;
	}
}