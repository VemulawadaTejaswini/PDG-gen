import java.util.*;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] X = new int[10^5];
		int kind=0;			
		for(int i=0;i<N;i++){
			int p = Integer.parseInt(sc.next());
			if(X[p-1]==0)kind++;
			X[p-1]=1;
		}
		int MaxN=kind-1+kind%2;
		System.out.println(MaxN);
		sc.close();
	}
}