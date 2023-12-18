import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	int A;
	int B;
	int K;
	int i = 0;

	Scanner sc = new Scanner(System.in);

	System.err.print("A = ");
	A = sc.nextInt();

	System.err.print("B = ");
	B = sc.nextInt();

	System.err.print("K =");
	K = sc.nextInt();


	while( i <= K) {
	    if ( A % 2 == 1){
		A = A - 1;
		A = A - A / 2;
		B = B + A / 2;
		i++;
	    }
	    else if ( A % 2 == 0){
		A = A - A / 2;
		B = B + A / 2;
		i++;
		
	    }

	    if ( B % 2 == 1 && i <= K){
		B = B - 1;
		B = B - B / 2;
		A = A + B / 2;
		i++;
		
	    }

	    else if ( B % 2 == 0 && i <= K ){
		B = B - B / 2;
		A = A + B / 2;
		i++;
	    }
	}

	System.out.println("A = " + A);
	System.out.println("B = " + B);
    }
}
