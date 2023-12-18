import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A;
		for(int i = 0; i < N; i++) {
			A = i * i;
			if(A > N) {
				System.out.println((i - 1) * (i - 1)); 
				break;
			}
			A = 0;
		}
	}

}
