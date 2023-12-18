import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = C/B;
		int F = A/D;
		if( C%B!=0 ){
			E++;
		}
		if( A%D!=0 ){
			F++;
		}
		if( E<=F ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}