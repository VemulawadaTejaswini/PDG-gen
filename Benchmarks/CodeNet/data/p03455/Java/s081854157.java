import java.util.*;
public class ABC_086_A_Product{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//input
		int a = sc.nextInt();
		int b = sc.nextInt();

		//output
		if( ( a * b ) % 2 == 1 ){
			System.out.println("Odd");
		}
		else{
			System.out.println("Even");
		}
	}
}
