import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int student = scan.nextInt();
		int i;
		
		for(i = 0 ; i < student ; i++) {
			String stay_student = scan.next();
			int stay_student_num = Integer.parseInt(stay_student);
			System.out.print(stay_student_num + " ");
			
		}
		scan.close();
	}
}