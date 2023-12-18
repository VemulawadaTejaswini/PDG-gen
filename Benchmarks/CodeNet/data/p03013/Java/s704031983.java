import java.util.Scanner;
public class Main {
	public static boolean Esta(int k, int[]A) {
		for(int i=0;i<A.length;i++) {
			if (A[i]==k){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] linea = s.nextLine().split(" ");
		int N=Integer.parseInt(linea[0]);
		int M=Integer.parseInt(linea[1]);
		int [] A= new int[(int)(M+1)];
		for(int i=1; i<=M;i++) {
			String[] linea2 = s.nextLine().split(" ");
			A[i]=Integer.parseInt(linea2[0]);
			
		}
		s.close();
		int []DP= new int[N+1];
		DP[1]=1;
		DP[2]=2;
		boolean a=true;
		for(int j=1;j<M;j++) {
			DP[A[j]]=0;
			if(A[j+1]-A[j]==1 && j!=1) {
				System.out.print(0);
				a=false;
				break;
			}
			}
		for(int k=3;k<=N;k++) {
			if(Esta(k,A)) {
				DP[k]=0;
			}
			else {
				DP[k]=DP[k-1]+DP[k-2];
			}
		}
		if(a) {
			System.out.print(DP[N]%1000000007);
		}
		}}
		