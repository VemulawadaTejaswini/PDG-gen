import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("[^0-9.]+");

		while(scan.hasNext()){
			double v = scan.nextDouble();
			double t = v/9.8;
			double y = 4.9*t*t;
			
			for(int n=1;n<1000;n++){
				if(5*n-5 > y){
					System.out.println(n);
					break;
				}
			}
		}
		
		scan.close();
	}
}