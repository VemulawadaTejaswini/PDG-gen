import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int d = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		
		if(d > t * s) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}

