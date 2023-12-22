import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		double degOfMin = min*6;
		double degOfHour = hour*30 + degOfMin/12;
		
        double deg = Math.abs(degOfHour - degOfMin);
        if (deg > 180){deg = 360 - deg;}
      	double rad = Math.toRadians(deg);
        double num3 = (num1*num1) + (num2*num2) - (2*num1*num2*Math.cos(rad));
      
		System.out.print(Math.sqrt(num3));
    }
}