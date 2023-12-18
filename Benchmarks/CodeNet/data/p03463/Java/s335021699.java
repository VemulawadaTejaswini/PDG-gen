import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if((A-B) == 1){
			System.out.println("Borys");
			return;
		}
		while(true){

			A++;
			if((B-A) == 1){
				System.out.println("Alice");
				return;
			}
			B--;
			if((B-A) == 1){
				System.out.println("Borys");
				return;
			}
		}
	}
}

