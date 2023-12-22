import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			double a = cin.nextDouble();
			double b = cin.nextDouble();
			double n = cin.nextDouble();
			a = a/b;
			int sum=0;
			for(int i = 0; i < n;i++){
				a *= 10.0;
				int c = (int)a;
				sum = sum+c%10;
			}
			System.out.println(sum);
		}
	}

}