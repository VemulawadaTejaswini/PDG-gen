import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc150_a();
	}
  
  	public static void solve_abc150_a(){
		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int X = sc.nextInt();
		
		if(500 * K >= X) System.out.println("Yes");
		else System.out.println("No");
		
		sc.close();
		
	}
}