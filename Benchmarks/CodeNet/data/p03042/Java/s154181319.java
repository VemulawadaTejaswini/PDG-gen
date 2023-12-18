import java.util.Scanner;

class Main{
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int s = stdIn.nextInt();
		int i = s % 100;
		int k = s / 100;
		if(i>=1 && i<=12 && k>=1 && k<=12)
			System.out.println("AMBIGUOUS");
		else if(k>=1 && k<=12)
			System.out.println("MMYY");
		else if(i>=1 && i<=12)
			System.out.println("YYMM");
		else
			System.out.println("NA");
	}
}