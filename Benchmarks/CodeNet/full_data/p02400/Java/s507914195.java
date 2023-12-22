import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	
	static double x = Math.PI;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Scanner scanner = new Scanner("2");
		int r = scanner.nextInt();
		System.out.println(method01(r) + " " + method02(r)); 
		 }
	public static double method01(int r){
		return (r * 2 * x);
		}
	public static double method02(int r){
		return (r * r * x);
	}
}