import java.util.Arrays;
import java.util.Scanner;
class Main{
	
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			//Input
			int N=Integer.parseInt(sc.next());
			int K=Integer.parseInt(sc.next());
			int[] A=new int[N];
			int sum=0;
			for(int i=0;i<N;i++){
				A[i]=Integer.parseInt(sc.next());
				sum=sum+A[i];
			}
			
			int[] B=new int[N];
			boolean[][] dq=new boolean[N][K];
			int cnt=0;
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					B[j]=(j!=i)?A[j]:0;
				}
				Arrays.sort(B);
			
				
				dq[0][0]=true;
				for(int kind=1;kind<N;kind++){
					dq[kind][0]=true;
					for(int j=1;(j<K)&&(j<=sum);j++){
						if(j-B[kind]>=0){
							dq[kind][j]=dq[kind-1][j]||dq[kind-1][j-B[kind]];
						}else{
							dq[kind][j]=dq[kind-1][j];
						}
					}
				}
				boolean noNeed=false;
				if(K>=A[i]){
					for(int k=K-A[i];k<K;k++){
						noNeed=noNeed||dq[N-1][k];
					}
				}else{noNeed=true;}
				if(!noNeed)cnt++;
			}
			
			System.out.println(cnt);
			for(int kind=0;kind<N;kind++){
				for(int j=0;j<K;j++){
					//System.out.println(kind+", "+j+": "+dq[kind][j]);
				}
			}
				
		}
	}
}