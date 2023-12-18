import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = Integer.parseInt(sc.next());

		int n1 = S/100;
		int n2 = S-n1*100;

		if(n1>12||n1==0) {
			if(n2>12||n2==0) {
				System.out.println("NA");
			}else {
				System.out.println("YYMM");
			}

		}else{
			if(n2>12||n2==0) {
				System.out.println("MMYY");
			}else {
				System.out.println("AMBIGUOUS");
			}
		}
	}
}