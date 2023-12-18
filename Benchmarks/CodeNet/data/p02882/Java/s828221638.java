import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.exec();
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double x = sc.nextDouble();
		
		sc.close();
		
		Double v = a * a * b;
		
		if(v/2 >= x){
			System.out.println((Math.atan(((a*b*b*0.5) / x)) / Math.PI) * 180);
		}else {
			System.out.println((Math.atan(2*(a*a*b-x) / (a*a*a)) / Math.PI) * 180);
		}
	}

}

