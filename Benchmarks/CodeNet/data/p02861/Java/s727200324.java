import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int town = scan.nextInt();
		int[] x = new int[town];
		int[] y = new int[town];
		double ave = 0;
		double sum = 0;

		for(int i=0;i<town;i++) {

			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}

		for(int i=0;i<town;i++) {
			for(int j=0;j<town;j++) {
			double	dis = Math.sqrt((x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]));
				 sum += dis;
				 ave = sum/town;
			}
		}

		System.out.println(ave);
		scan.close();
	}

}
