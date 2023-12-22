import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int midExam = -1, finalExam = -1, supple = -1, sumExam = 0;
		ArrayList<Character> grade = new ArrayList<Character>();
		
		for (;;) {
			try {
				midExam = in.nextInt();
				finalExam = in.nextInt();
				supple = in.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (midExam == -1 && finalExam == -1 && supple == -1)
				break;
			sumExam = midExam + finalExam;
			
			if (midExam == -1 || finalExam == -1 || sumExam < 30)
				grade.add('F');
			else if (sumExam >= 80)
				grade.add('A');
			else if (sumExam >= 65)
				grade.add('B');
			else if (sumExam >= 50 || supple >= 50)
				grade.add('C');
			else
				grade.add('D');
		}
		for (Iterator<Character> i = grade.iterator(); i.hasNext();)
			System.out.println(i.next());
		in.close();
	}
}