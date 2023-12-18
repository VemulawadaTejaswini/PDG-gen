import java.util.Scanner;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;

public class Tutorial011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
	
		int b = sc.nextInt();
		//int[] a = new int[200];
		//int count=0;
		if(a<=0&&0<=b) {
			System.out.println("Zero");
			System.exit(0);
		}else if(0<=a) {
			System.out.println("Positive");
			
		}else if((b-a)%2==0) {
			System.out.println("Negative");

		}else {
			System.out.println("Positive");
		}
	}
}
