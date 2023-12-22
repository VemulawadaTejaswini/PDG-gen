import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		while(scan.hasNext()){
			double v,t,y,f;
			int N;
			v = Double.parseDouble(scan.next());
			t = v / 9.8;
			y = 4.9 * Math.pow(t,2);
			f = (y / 5.0) + 1.0;
			N = (int)f;
			System.out.println(N);
		}
		System.exit(0);
	}

}