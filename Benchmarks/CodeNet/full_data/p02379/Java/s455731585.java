import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1=sc.nextDouble(), x2=sc.nextDouble();
		double y1=sc.nextDouble(), y2=sc.nextDouble();
		
		double l = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		System.out.printf("%s", Math.sqrt(l));
		
	}
}

