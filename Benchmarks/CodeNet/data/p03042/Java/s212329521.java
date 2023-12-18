import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		boolean flgYYMM = 1 <= s % 100 && s % 100 <= 12;
		boolean flgMMYY = 1 <= s / 100 && s / 100 <= 12;
		
		if (flgYYMM) 
			if (flgMMYY)
				System.out.println("AMBIGUOUS ");
			else
				System.out.println("YYMM");
		else
			if (flgMMYY)
				System.out.println("MMYY");
			else
				System.out.println("NA");
		

		sc.close();
	}
	
}


