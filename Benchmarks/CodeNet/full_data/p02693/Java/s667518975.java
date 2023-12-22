import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		  Scanner scanner = new Scanner(System.in);

int K = scanner.nextInt();
int A = scanner.nextInt();
int B = scanner.nextInt();
boolean X = false;

	for(; A <= B; A++) {
    if(A % K == 0) {
    	X = true;
	}
	if(X) {
    System.out.println("OK");
	}else {
	System.out.println("NG");
	}
	  }
	}
}