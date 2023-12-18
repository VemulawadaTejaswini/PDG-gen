import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++){
			if(i==0){
				A[0] = 0;
				continue;
			}
			A[i] = sc.nextInt();
		}
		sc.close();

		int[] ret = getProcess(N, A);

		for(int i=0; i<ret.length; i++){
			System.out.println(ret[i]);
		}
	}

	public static int[] getProcess(int N, int[] A){
		int[] ret = new int[N];
		for(int i=0; i<ret.length; i++){
			ret[i] = 0;
		}

		for(int i=0; i<A.length; i++){
			if(A[i]==0){
				continue;
			}
			ret[ A[i]-1 ] ++;
		}

		return ret;
	}


}