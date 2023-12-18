
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		
		int[] L = new int[M],R = new int[M],D = new int[M];
		
		for(int i = 0;i < M;i++){
			L[i] = s.nextInt()-1;
			R[i] = s.nextInt()-1;
			D[i] = s.nextInt();
		}
		
		int x[] = new int[N];
		for(int i = 0;i < N;i++){
			x[i] = 0;
		}
		for(int i = 0;i < M;i++){
			x[
			  R[i]] 
					= x[L[i]] 
							+ D[i];
		}
		
		boolean a = true;
		for(int i = 0;i < M;i++){
			if(x[R[i]] - x[L[i]] != D[i]){
				a = false;
				break;
			}
		}
		
		System.out.println(a ? "Yes":"No");
		
		
	}

}