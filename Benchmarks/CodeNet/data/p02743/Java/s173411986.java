import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		double aa = sqrt(a);
		double bb = sqrt(b);
		double cc = sqrt(c);


		if(aa + bb < cc) {
			System.out.print("Yes");
		} else {
			System.out.println("No");
		}
	}

	//ニュートン法
    public static double sqrt(double a){
        if (Double.isNaN(a) || a < 0.0) {
            return Double.NaN;
        }
        if (a == 0.0) {
            return 0.0;
        }
        double x = a > 1.0 ? a : 1.0;
        double d = a;
        while(d > 0.0){
            double x1 = (x + a / x) / 2;
            d = x - x1;
            x = x1;
        }
        return x;
    }

}
