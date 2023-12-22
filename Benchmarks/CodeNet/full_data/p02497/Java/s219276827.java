import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m;
		int f;
		int r;
		int sum;
		while (true) {
			m = scanner.nextInt();
			f= scanner.nextInt();
			r= scanner.nextInt();
			sum=m+f;
			if (m== -1 && f == -1 &&r==-1) {
				break;
			}
			if(sum>=80)
				System.out.println("A");
			else if(sum>=65)
				System.out.println("B");
			else if(sum>=50)
				System.out.println("C");
			else if(sum>=30){
				if(r>=50)
				System.out.println("C");
				else
				System.out.println("D");
			}
			else
				System.out.println("F");



		}
		scanner.close();
	}
}