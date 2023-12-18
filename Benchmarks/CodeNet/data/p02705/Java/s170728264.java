import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(answer(scan.nextInt()));
	}
	public static double answer(int radius){
		return (double)(2 * Math.PI * radius);
	}
}