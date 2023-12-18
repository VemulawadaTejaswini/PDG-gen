import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long[] a=new long[n];
		long[] sum=new long[n+1];
		HashMap<Long,Integer> map=new HashMap<>();
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
			sum[i+1]=(sum[i]+a[i]-1+k)%k;
		}
		long ans=0;
		int j=0;
		for(int i=0; i<=n; i++){
			if(i-j==k){
				map.put(sum[j],map.get(sum[j])-1);
				j++;
			}
			if(map.containsKey(sum[i])){
				ans+=map.get(sum[i]);
				map.put(sum[i],map.get(sum[i])+1);
			}else{
				map.put(sum[i],1);
			}
		}
		System.out.println(ans);
	}
}
