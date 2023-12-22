import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = Double.parseDouble(scan.nextLine());
		double dbCir = (Math.PI * r * 2.0);
		double dbArea = (Math.PI * r * r);

		System.out.println(dbCir + " " + dbArea);
		scan.close();
	}
}