import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int dataset = 4;
		double[] data = new double[dataset];
		for(int i = 0; i < dataset; i++) {

			data[i] = stdin.nextDouble();

		}

		for(int i = 0; i < dataset; i++) {

			if(data[i] <= 48.00) {
				System.out.println("light fly");
			} else if(data[i] > 48.00 && data[i] <=51.00){
				System.out.println("fly");
			} else if(data[i] > 51.00 && data[i] <=54.00){
				System.out.println("bantam");
			} else if(data[i] > 54.00 && data[i] <=57.00){
				System.out.println("feather");
			} else if(data[i] > 57.00 && data[i] <=60.00){
				System.out.println("light");
			} else if(data[i] > 60.00 && data[i] <=64.00){
				System.out.println("light welter");
			} else if(data[i] > 64.00 && data[i] <=69.00){
				System.out.println("welter");
			} else if(data[i] > 69.00 && data[i] <=75.00){
				System.out.println("light middle");
			} else if(data[i] > 75.00 && data[i] <=81.00){
				System.out.println("middle");
			} else if(data[i] > 81.00 && data[i] <=91.00){
				System.out.println("light heavy");
			} else {
				System.out.println("heavy");
			}
		}


	}

}