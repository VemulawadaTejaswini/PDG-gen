import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double x = sc.nextInt();
        double res;
        
        
        res = Math.toDegrees(Math.atan(a*a*a/(2*a*a*b-2*x)));
        System.out.println(90-res);
	}
}