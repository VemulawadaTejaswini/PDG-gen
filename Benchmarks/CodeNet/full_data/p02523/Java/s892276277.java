import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		String[] s = sc2.nextLine().split("[\\s]+");
		double x = Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
		double y = Integer.parseInt(s[1]) - Integer.parseInt(s[3]);
		System.out.println(Math.sqrt(x*x+y*y));
	}
}