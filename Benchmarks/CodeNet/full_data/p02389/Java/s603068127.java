import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		 Scanner sca = new Scanner(System.in);
		 int a = sca.nextInt();
		 sca.close();
		 
		 Scanner scb = new Scanner(System.in);
		 int b = scb.nextInt();
		 scb.close();
		 
		 int x = a * b;
		 
		 System.out.println(" ");
		 
		 System.out.println(x);
		 
	}
}