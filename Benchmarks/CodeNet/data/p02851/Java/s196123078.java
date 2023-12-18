
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		final int n=sc.nextInt();
		final int k=sc.nextInt();
		
		if(k<=1){
			System.out.println(0);
			System.exit(0);
		}
		
		int[] sum=new int[n];
		
		long ans=0;
		
		HashMap<Integer, Integer> map=new HashMap();
		//int[] map=new int[k];
		
		for(int i=0;i<n;i++){
			int m=sc.nextInt();
			int a=(m-1)%k;
			if(k==2){
				if(a==0)ans++;
				continue;
			}
			if(i==0){
				sum[i]=a;
			}else{
				sum[i]=(sum[i-1]+a)%k;
			}
			
			//map[sum[i]]++;
			if(map.containsKey(sum[i])){
				int tmp=map.get(sum[i]);
				map.put(sum[i], tmp+1);
			}else{
				map.put(sum[i], 1);
			}
			
			if(i>=k-1){//map[sum[i-k+1]]--;{
				int tmp=map.get(sum[i-k+1]);
				map.put(sum[i-k+1], tmp-1);
			     // System.out.println(" sum:"+sum[i]+" map:"+map.get(sum[i]));
			}
			if(i<k-1){
				if(sum[i]==0)ans++;
			}
			//ans=ans+map[sum[i]]-1;
			int tmp=map.get(sum[i]);
			ans=ans+tmp-1;
			//System.out.println(ans);			
	
			//System.out.println(" m:"+m+" a:"+a+" sum:"+sum[i]+" ans:"+ans);
			
		}
		System.out.println(ans);
	}
}
		
	