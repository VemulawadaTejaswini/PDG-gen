import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] distance = str.split(" ");
		double x = Math.abs(Integer.parseInt(distance[0]) - Integer.parseInt(distance[2]));
		double y = Math.abs(Integer.parseInt(distance[1]) - Integer.parseInt(distance[3]));
		double ans = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
		System.out.printf("%.8f",ans);
		

	}

}