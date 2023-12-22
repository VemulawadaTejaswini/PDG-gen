import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double g = scan.nextDouble();
			if(g <= 48.00){
				System.out.println("light fly");
			}else if(g <= 51.00){
				System.out.println("fly");
			}else if(g <= 54.00){
				System.out.println("bantam");
			}else if(g <= 57.00){
				System.out.println("feather");
			}else if(g <= 60.00){
				System.out.println("light");
			}else if(g <= 64.00){
				System.out.println("light welter");
			}else if(g <= 69.00){
				System.out.println("welter");
			}else if(g <= 75.00){
				System.out.println("light middle");
			}else if(g <= 81.00){
				System.out.println("middle");
			}else if(g <= 91.00){
				System.out.println("light heavy");
			}else{
				System.out.println("heavy");
			}
		}
	}
}