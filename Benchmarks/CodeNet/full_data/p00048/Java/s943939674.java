import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double num = sc.nextDouble();
			
			if(num > 91.00){
				System.out.println("heavy");
			} else if(num > 81.00){
				System.out.println("light heavy");
			} else if(num > 75.00){
				System.out.println("middle");
			} else if(num > 69.00){
				System.out.println("light middle");
			} else if(num > 64.00){
				System.out.println("welter");
			} else if(num > 60.00){
				System.out.println("light welter");
			} else if(num > 57.00){
				System.out.println("light");
			} else if(num > 54.00){
				System.out.println("feather");
			} else if(num > 51.00){
				System.out.println("bantam");
			} else if(num > 48.00){
				System.out.println("fly");
			} else {
				System.out.println("light fly");
			}
		}
		sc.close();
	}

}