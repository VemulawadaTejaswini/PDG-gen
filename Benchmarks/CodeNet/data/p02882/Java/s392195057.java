
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int volume = a * a * b;
		double radian = 0;
		if(volume == x * 2){
			radian = Math.atan(b / (double)a);
		}else if(volume > x * 2){
			double c = x / (double)a / b * 2;
			radian = Math.atan(b / c);
		}else{
			double c = (x - volume / (double)2) / a / a * 2;
			radian = Math.atan((b - c) / (double)a);
		}
		System.out.println(radian * 180 / Math.PI);
	}
}
