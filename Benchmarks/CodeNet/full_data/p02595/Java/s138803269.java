import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double d = sc.nextDouble();
		double xy[][] = new double[2][n];
		int count=0;

		for(int i=0;i<n;i++) {
			xy[0][i]=sc.nextInt();
			xy[1][i]=sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			if(Math.sqrt((xy[0][i]*xy[0][i])+(xy[1][i]*xy[1][i]))<=d) {
				count++;
			}
		}
			System.out.println(count);




	}

}