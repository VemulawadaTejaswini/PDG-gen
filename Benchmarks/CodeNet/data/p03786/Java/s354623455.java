import java.util.*;
public class Main{
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
		A[i]=sc.nextInt();
		}
		Arrays.sort(A);
		long[] maxSize=new long[N];
		maxSize[0]=A[0];
		int limit=1000000000;
		for(int i=1;i<N;i++){
			maxSize[i]=maxSize[i-1]+A[i];
			limit=i+1;
			if(maxSize[i]>1000000000){
				break;
			}
		}
		int can=0;
		for(int i=0;i<limit-1;i++){
			if(A[i+1]-maxSize[i]>maxSize[i]){
				can=i+1;
			}
		}
		
		System.out.println(N-can);

	}
 
}
