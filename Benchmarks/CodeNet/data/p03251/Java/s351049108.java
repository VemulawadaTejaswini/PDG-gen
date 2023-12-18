import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int numx[];
		numx = new int[N];
		
		int numy[];
		numy = new int[M];
		
		int i = 0;
		int j = 0;
		for(i = 0;i < N;i++){
			numx[i] = sc.nextInt();
		}
		for(i = 0;i < M;i++){
			numy[i] = sc.nextInt();
		}
		
		Arrays.sort(numx);
		Arrays.sort(numy);
		
		N = N - 1;
		M = M - 1;
		
		if(X < Y && numx[N] < numy[0] &&X != numx[N] && X < numy[0] && numx[N] < Y){
			
			System.out.println("No War");
		}
		else{
			System.out.println("War");
		}
	}
}