import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();int M=sc.nextInt();int K=sc.nextInt();
		
		
		int arr[]=new int[N+1];
		int brr[]=new int[M+1];
		arr[0]=0;
		brr[0]=0;
		
		for(int i=0;i<N;i++) {
			arr[i+1]=sc.nextInt()+arr[i];
		}
		
		for(int i=0;i<M;i++) {
			brr[i+1]=sc.nextInt()+brr[i];
		}
		
		int ans=0;
		int q=M;
		for(int i=1;i<N+1;i++) {
			if(arr[i]>K) break;
			while(brr[q]>K-arr[i]&&q>=0) q--;
			ans=Math.max(ans,q+i);
		}
		
		System.out.println(ans);
		
	}

}
