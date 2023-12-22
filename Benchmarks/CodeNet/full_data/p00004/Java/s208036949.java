
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Double> answerX = new ArrayList<Double>();
	static ArrayList<Double> answerY = new ArrayList<Double>();
	
	public static void main(String[] args) {
				
		try{
			setAnswerFromInputs();
		}catch(NoSuchElementException e){
			//üÍÌIíèðó¯æÁÄ½àµÈ¢ÅÌÖ
		}
		
		//x,yÌoÍ
		//üÍª³íÅ êÎx,yÌðXgÌ·³Í¯¶ÈÌÅ
		//±±ÅÍXgÌ·³ð`FbNµÈ¢
		for(int i = 0; i < answerX.size(); i++){
			System.out.printf("%.3f %.3f\n", answerX.get(i), answerY.get(i));
		}
	}
	
	private static void setAnswerFromInputs() throws NoSuchElementException{
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			double x = getX(a, b, c, d, e, f);
			double y = getY(a, b, c, d, e, f);
			x = fixIncorrectNumber(x);
			y = fixIncorrectNumber(y);
			answerX.add(x);
			answerY.add(y);
		}
	}
	
	private static double getX(int a, int b, int c, int d, int e, int f){
		int denominator = a * e - b * d;
		int numerator = c * e - b * f;
		return (double)numerator / (double)denominator;
	}
	
	private static double getY(int a, int b, int c, int d, int e, int f){
		int denominator = b * d - a * e;
		int numerator = c * d - a * f;
		return (double)numerator / (double)denominator;
	}
	
	private static double fixIncorrectNumber(double x){
		if(x == (-0.0)){
			x = 0.0;
		}
		return x;
	}
}