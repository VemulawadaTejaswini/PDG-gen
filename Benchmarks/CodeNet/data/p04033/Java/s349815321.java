import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long ans = a;

		if (0<a && 0<b){
			System.out.println("Positive");
		} else if(a == 0 || b == 0){
			System.out.println("Zero");
		} else if(a>0 && b<0){
			System.out.println("Zero");
		}else if(a<0 && b>0){
			System.out.println("Zero");
		}else if (a<0 && b<0){
			if ((b - a)%2 !=0) System.out.println("Positive");
			else 			System.out.println("Negative");
		} 			

		sc.close();

	}
}

