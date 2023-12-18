import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		int count=0;
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		Out:while(true){
			for(int i=0;i<N;i++){
				if(A[i]%2 != 0){
					break Out;
				}
				A[i]/=2;
			}
			count++;
		}
		System.out.println(count);
	}
}