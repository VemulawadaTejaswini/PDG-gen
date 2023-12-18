
import java.util.Scanner;

public class Main {
	
	static Boolean isInt(double x) {
		if (x==(int)x) return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(isInt(n/1.08)) {
			System.out.println((int)(n/1.08));
		}
		else {
			if(Math.floor(Math.round(n/1.08)*1.08)==n) System.out.println(Math.round(n/1.08));
			else System.out.println(":(");
		}
	}

}