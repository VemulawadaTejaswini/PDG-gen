import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
	int B = scan.nextInt();
	int C = scan.nextInt();
	int D = scan.nextInt();
	int sum1, sum2 ;
	if(A>=B){
		sum1 = B;
	}else{
		sum1 = A;
	}
	
	if(C>=D){
		sum2 = D;
	}else{
		sum2 = C;
	}
	
	int sum = sum1 + sum2;
	System.out.print(sum);


	}

}
