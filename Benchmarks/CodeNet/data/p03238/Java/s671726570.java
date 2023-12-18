import java.util.Scanner;

public class TestA{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int N;
	int A, B;

	N = scan.nextInt();

	if(N == 1){
	    System.out.println("Hello World");
	}else{
	    A = scan.nextInt();
	    B = scan.nextInt();
	    System.out.println(A+B);
	}
    }
}
