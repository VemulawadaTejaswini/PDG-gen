import java.util.*;

public class Main{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args){
		int n=readInt();
		long a;
		long s[]=new long[n+1];
		for(int i=0;i<n;i++){
			a=readLong();
			if(i==0)s[i]=a;
			else s[i]=s[i-1]+a;
		}
		s[n]=0;
		HashMap<Long,Long> mp = new HashMap<Long,Long>();
		for(int i=0;i<n+1;i++){
			Long t=mp.get(s[i]);
			if(t==null)mp.put(s[i],(long)1);
			else mp.put(s[i],t+1);
		}
		long ans=0;
		for(Long x:mp.keySet()){
			long c=mp.get(x);
			ans+=c*(c-1)/2;
		}
		System.out.println(ans);
	}
	
	private static int readInt(){
		return Integer.parseInt(sc.next());
	}
	private static long readLong(){
		return Long.parseLong(sc.next());
	}
}