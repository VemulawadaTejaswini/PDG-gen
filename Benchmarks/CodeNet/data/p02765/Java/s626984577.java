import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc165_a();
	}
	
	public static void solve_abc165_a(){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int R = sc.nextInt();
		
		if(N < 10){
			R += 100 * (10 -N);
		}
		
		System.out.println(R);
	}
}