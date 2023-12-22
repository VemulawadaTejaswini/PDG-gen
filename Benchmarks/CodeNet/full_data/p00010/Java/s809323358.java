import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0010_CircumscribedCircleOfaTriangle {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0010_CircumscribedCircleOfaTriangle test = new Problem0010_CircumscribedCircleOfaTriangle();
			Main test = new Main();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int dataCount = Integer.parseInt(reader.readLine());
			
			for(int count = 0; count < dataCount; count++) {
				String[] textArray = reader.readLine().split(" ");
				double[] numbers = new double[6];
				for(int i = 0; i < textArray.length; i++) {
					numbers[i] = Double.parseDouble(textArray[i]);
				}
				test.showAnswer(numbers);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void showAnswer(double[] array) {
		double x = getX(array);
		double y = getY(array,x);
		double r = getR(array, x, y);
		
		System.out.printf("%.4f %.4f %.4f", x, y, r);
	}
	double getX(double[] array) {
		if(array[3] == array[1]) {
			return (array[0] + array[2]) / 2;
		} else if(array[5] == array[1]) {
			return (array[0] + array[4]) / 2;
		} else {
			double numerator1 = (Math.pow(array[3], 2)-Math.pow(array[1], 2)-Math.pow(array[0], 2)+Math.pow(array[2], 2))
								/ (2 * (array[3]-array[1]));
			double numerator2 = (Math.pow(array[5], 2)-Math.pow(array[1], 2)-Math.pow(array[0], 2)+Math.pow(array[4], 2))
								/ (2 * (array[5]-array[1]));
			
			System.out.println("numerator1" + numerator1 +"\tnumerator2" + numerator2);
			double numerator = numerator1 - numerator2;
			double denominator1 = (array[0] - array[2]) / (array[3] - array[1]);
			double denominator2 = (array[0] - array[4]) / (array[5] - array[1]);
			
			double denominator = denominator1 - denominator2;
			System.out.println("numerator" + numerator +"\tdenominator" + denominator);
			return numerator / denominator;
		}
	}
	double getY(double[] array, double x) {
		if(array[3] == array[1]) {
			double coefficient = (array[0] - array[4]) / (array[5] - array[1]);
			double constant = (Math.pow(array[5], 2)-Math.pow(array[1], 2)-Math.pow(array[0], 2)+Math.pow(array[4], 2))
								/ (2 * (array[5]-array[1]));
			
			return coefficient * x + constant;
		} else if(array[5] == array[1]) {
			double coefficient = (array[0] - array[2]) / (array[3] - array[1]);
			double constant = (Math.pow(array[3], 2)-Math.pow(array[1], 2)-Math.pow(array[0], 2)+Math.pow(array[2], 2))
								/ (2 * (array[3]-array[1]));
			
			double y = coefficient * x + constant;
			return y;
		} else {
			double coefficient = (array[0] - array[2]) / (array[3] - array[1]);
			double constant = (Math.pow(array[3], 2)-Math.pow(array[1], 2)-Math.pow(array[0], 2)+Math.pow(array[2], 2))
								/ (2 * (array[3]-array[1]));
			
			double y = coefficient * x + constant;
			return y;
		}
	}
	double getR(double[] array, double x, double y) {
		double r = Math.sqrt(Math.pow(array[0] - x, 2) + Math.pow(array[1] - y, 2));
		
		return r;
	}
}