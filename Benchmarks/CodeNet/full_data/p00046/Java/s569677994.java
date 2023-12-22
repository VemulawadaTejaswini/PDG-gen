import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		double mux = 0;
		double min = 1000000000;
		while(scan.hasNext()){
			double x = scan.nextDouble();
			if(mux < x){
				mux = x;
			}
			if(min > x){
				min = x;
			}
		}
		System.out.println(mux - min);
	}
}