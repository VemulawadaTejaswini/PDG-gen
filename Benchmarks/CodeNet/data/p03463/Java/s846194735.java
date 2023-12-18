import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if((B-A-1)%2 == 1){
			System.out.println("Alie");
			return;
		} else {
			System.out.println("Borys");
		}
	}
}
