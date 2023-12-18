import java.util.Scanner;

public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
	int B = scan.nextInt();
	if(A - 2*B >= 0){
		System.out.println(A - 2*B);
	}
	else{
		System.out.println(0);
	}
}