import java.util.Scanner;

//A:Alice's Farsight
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double z1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double z2 = sc.nextDouble();
			System.out.printf("%.5f\n", Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)+Math.pow(z1-z2, 2)));
		}
	}
}