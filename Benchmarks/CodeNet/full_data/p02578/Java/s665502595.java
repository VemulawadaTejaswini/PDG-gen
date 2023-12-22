import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		int step=0;
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;i++){
			if(A[i]>A[i+1]){
				step+=A[i]-A[i+1];
				A[i+1]=A[i];
			}
		}
		System.out.println(step);
	}	
}
			