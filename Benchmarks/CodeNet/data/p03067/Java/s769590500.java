import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
 
		String InStr = scan.nextLine();
		String[] AryStr = InStr.split(" ");
 
		int A;
		int B;
		int C;
		int D;
 
		A = Integer.parseInt(AryStr[0]);
		B = Integer.parseInt(AryStr[1]);
		C = Integer.parseInt(AryStr[2]);
 
		if ( A > B ) {
                     D = A;
                     A = B;
                     B = D;
                }
		if ( (A <= C) && (C <= B)) {
                    System.out.println("Yes");
                } else { 
                    System.out.println("No");
                }
	}
}