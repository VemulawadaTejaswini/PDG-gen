import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int HP = 0;
		long HPtotal = 0;
		for(int i=0; i<N-K; i++) {

			HP = sc.nextInt();
			HPtotal+=HP;
          
		}
      		System.out.println(HPtotal);
	}		
}