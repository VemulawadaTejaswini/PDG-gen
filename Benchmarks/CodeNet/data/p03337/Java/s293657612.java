import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  int A = sc.nextInt();
		  int B = sc.nextInt();
		  sc.close();
		  
		  int answer = A + B;
		  answer = Math.max(answer, A - B);
		  answer = Math.max(answer, A * B);
		  
		  System.out.println(answer);
	          System.exit(0);
	    }
}