package sandbox;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.next();
        String line2 = sc.next();
        String line3 = sc.next();

        System.out.println(""+ line1.charAt(0)+line2.charAt(1)+line3.charAt(2));
    }
}
