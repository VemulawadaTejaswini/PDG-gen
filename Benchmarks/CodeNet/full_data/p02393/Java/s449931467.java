import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int numAry[] = new int[3];
		
		numAry[0] = stdIn.nextInt();
		numAry[1] = stdIn.nextInt();
		numAry[2] = stdIn.nextInt();
		
		int tmp = 0;
		
		if (numAry[0] > numAry[1]) {
			tmp = numAry[1];
			numAry[1] = numAry[0];
			numAry[0] = tmp;
		}
		if (numAry[1] > numAry[2]) {
			tmp = numAry[2];
			numAry[2] = numAry[1];
			numAry[1] = tmp;	
		}
		if (numAry[0] > numAry[1]) {
			tmp = numAry[1];
			numAry[1] = numAry[0];
			numAry[0] = tmp;
		}
		
		System.out.print(numAry[0] + " ");
		System.out.print(numAry[1] + " ");
		System.out.print(numAry[2]);
		System.out.println();
		
	}
}
