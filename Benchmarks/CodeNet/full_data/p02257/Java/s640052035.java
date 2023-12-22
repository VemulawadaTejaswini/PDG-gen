import java.util.*;

public class Main {
	public static void main(String[] args) {

		boolean prime_flag;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0,j; i < N; i++) {
			 prime_flag = true;
			 j = sc.nextInt();
			 for (int k = 2; k < j;k++){
				 if(j % k == 0){
					prime_flag = false;
					break;
				 }
			 }
			 if(prime_flag){
				 cnt++;
			 }
		}
		System.out.println(cnt);
	}
}