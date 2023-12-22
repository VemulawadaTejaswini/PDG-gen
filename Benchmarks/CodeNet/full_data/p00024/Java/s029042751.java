import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double v = sc.nextDouble();
		double t = v / 9.8;
		double y = 4.9 * t * t;
		double f = (y / 5) + 1;
		int F = (int)f;
		if(f%5!=0){
			F++;
		}
		System.out.println(F);
	}
}