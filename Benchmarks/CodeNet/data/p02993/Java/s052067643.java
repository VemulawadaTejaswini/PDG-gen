import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int p = scn.nextInt();
		System.out.println((p/1000==(p%1000)/100 || (p%1000)/100 == (p%100)/10 || (p%100) == p%10)?"Bad":"Good");
	}

}