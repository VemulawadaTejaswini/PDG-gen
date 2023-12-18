import java.util.Scanner;

public class EntranceExamination {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double T = scan.nextInt();
		double X = scan.nextInt();
		
		double time = T/X;
		System.out.println(time);
	}
}