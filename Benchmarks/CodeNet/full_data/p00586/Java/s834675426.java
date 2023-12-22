import java.util.InputMismatchException;
import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		String a = scan.next();
		while(!a.equals("EOF")){
				int A = Integer.parseInt(a);
				int B = scan.nextInt();
				System.out.println(A+B);
				a = scan.next();
		}
	}
}