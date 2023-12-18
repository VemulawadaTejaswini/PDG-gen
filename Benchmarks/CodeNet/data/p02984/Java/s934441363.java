import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		for(int i=0;i<=A[0];i++){
			int[] B=new int[N];
			B[0]=i;
			for(int j=1;j<N;j++){
				B[j]=A[j-1]-B[j-1];
			}
			int count=0;
			for(int l=0;l<N;l++){
				if(l!=N-1&&B[l]+B[l+1]==A[l+1]){
					count++;
				}else if(B[0]+B[N-1]==A[N-1]){
					count++;
				}
			}
			
			if(count==N){
				for(int k=0;k<N;k++){
					System.out.println(2*B[k]);
				
				}
			break;
			}
		}
	}
}