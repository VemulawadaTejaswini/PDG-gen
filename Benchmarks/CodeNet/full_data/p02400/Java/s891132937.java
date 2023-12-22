import java.util.Scanner;

public class test00 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		double dbCir = (r * 2.0 * Math.PI);
		double dbArea = (r * r * Math.PI);

		System.out.println(dbCir + " " + dbArea);
		scan.close();
	}
}