import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int year;
		long money;
		double X;
		Scanner sc = new Scanner(System.in);
		
		X = Double.parseDouble(sc.next());
		sc.close();
		
		money = 100;
		for(year = 0;money < X;year++,money *= 1.01);
		
		System.out.println(year);
	}
}
