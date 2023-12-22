import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			int chuu = sc.nextInt();
			int kima = sc.nextInt();
			int sai = sc.nextInt();
			if (chuu==-1 && kima==-1 && sai==-1) {break;}
			
			if (chuu==-1 || kima==-1) {System.out.println("F");}
			else if (chuu+kima >= 80) {System.out.println("A");}
			else if (chuu+kima >= 65 && chuu+kima <80) {System.out.println("B");}
			else if (chuu+kima >=50 && chuu+kima < 65) {System.out.println("C");}
			else if (chuu+kima >=30 && chuu+kima <50) {
				if (sai >= 50) {System.out.println("C");}
				else {System.out.println("D");}
			}
			else if (chuu+kima < 30) {System.out.println("F");}
		}
	}
}
