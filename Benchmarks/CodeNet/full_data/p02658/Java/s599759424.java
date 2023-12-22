
import java.util.Scanner;

public class Main  {
	

	public static  void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int soe =0;
	int N = sc.nextInt();
	long[] A = new long [N];	
	long kai = 1;
	boolean a = false;;
		
		while(soe != N) {
			A[soe] = sc.nextLong();
			kai = kai * A[soe];
			soe++;
			if(A[soe] == 0) {
				System.out.println(0);
				a = true;
				break;
			}
		}
		 if(kai > 10 * 10 * 10 * 10 * 10 * 10 *10 *10 *10 *10 *10 *10 *10 *10 *10 *10 *10 *10 && a == false ) {
			System.out.println(-1);
		}else if(a == false){
			
			System.out.println(kai);
		}
			
	}
}
