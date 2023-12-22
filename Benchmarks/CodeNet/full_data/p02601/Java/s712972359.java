import java.util.*;
public class Main{
	public static void main(String args[]){

		Scanner ob = new Scanner(System.in);
		int A = ob.nextInt();
		int B = ob.nextInt();
		int C = ob.nextInt();
		int K = ob.nextInt();
		//boolean bool = false;

		while(K > 0){

			if ((A < B) && (B < C)) {
				break;
			}
			else if(A > B){
				B *= 2;
			}
			else if(B > C){
				C *= 2;
			}

			//System.out.println("A: " + A + " B: " + B + " C: " + C);

			K--;
		}

		if ((A < B) && (B < C)) {
				System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
