import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		int B=0;
		for(int i=0;i<N;i++){
			if(i==0)
				B=A[0];
			else
				B=A[i]-B;
		}
		System.out.println(B);	
		for(int i=0;i<N-1;i++){
			B/=2;
			B=(A[i]-B)*2;
			System.out.println(B);
		}
	}
}