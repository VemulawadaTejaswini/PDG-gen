import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scannerA = new Scanner(System.in);
		int A = scannerA.nextInt();
		Scanner scannerB = new Scanner(System.in);
		int B = scannerB.nextInt();
		Scanner scannerC = new Scanner(System.in);
		int C = scannerC.nextInt();
		Scanner scannerD = new Scanner(System.in);
        int D = scannerD.nextInt();
		int L = A + B;
		int R = C + D;
		if(L > R){
			System.out.println("Left");
		}else if(L == R){
			System.out.println("Balanced");
		}else if(L < R){
			System.out.println("Right");
		}
	}
}