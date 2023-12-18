import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String inputStrN=sc.nextLine();
	int N = Integer.parseInt(inputStrN);

	if(N == 1){
		System.out.println("Hello World");
	}else{
		int A = Integer.parseInt(sc.nextLine());
		int B = Integer.parseInt(sc.nextLine());

		System.out.println(A+B);
	}

	}
}