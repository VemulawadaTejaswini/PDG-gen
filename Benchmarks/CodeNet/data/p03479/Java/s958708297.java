import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long X = scn.nextLong();
		long Y = scn.nextLong();
		System.out.println((long)(Math.log(Y/X)/Math.log(2))+1);

	}

}
