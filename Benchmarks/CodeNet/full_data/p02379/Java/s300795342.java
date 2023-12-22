import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1=sc.nextDouble(),y1=sc.nextDouble();
		double x2=sc.nextDouble(),y2=sc.nextDouble();
		System.out.printf("%.9f\n",Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
	}

}

