
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		int N = sc.nextInt();
		int A[] = new int[N];
		long S = 0;
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
			S += A[i];
		}
		if(H <= S){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
