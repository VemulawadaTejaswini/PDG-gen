import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double d = sc.nextDouble();
		int count =0;
		for (int i =0;i<n;i++) {
			double x = sc.nextDouble();
			double y =sc.nextDouble();
			double power = (Math.sqrt(Math.pow(x, 2) +Math.pow(y, 2)));
			if(power<=d) {
				count++;}}
		System.out.println(count);

	}

}
