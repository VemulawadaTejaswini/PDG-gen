//package ABC147A;
import java.util.*;

public class Main{
	public static void main(String[] args){
		
		long startTime = System.currentTimeMillis();
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		long div=(long)Math.pow(10, 9)+7;
		long[] A=new long[n];
		
		long ans=0;
		
		for(int i=0;i<n;i++){
			A[i]=sc.nextLong();
		}
		
		for(int i=0;i<60;i++){
			long a=0;
			long count1=0;

			for(int j=0;j<n;j++){
				if((A[j]>>i&1)==1)count1++;
				//System.out.println("j:"+j+" l:"+l+" res: "+l/(long)(Math.pow(2,j)));
			}
			a=a+count1*(n-count1);
			a=(a<<i);
			
			ans+=a;
			ans%=div;
		}

		
		System.out.println(ans);
		long endTime = System.currentTimeMillis();
		//System.out.println("処理時間：" + (endTime - startTime) + " ms");
	}
}
