import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x=sc.nextLong();
		long m=sc.nextLong();
		ArrayList<Long> arr=new ArrayList<Long>();
		long ans=x;
		long prev=x;
		int i;
		for(i=2;i<=n;i++) {
			arr.add(prev);
			prev=(prev*prev)%m;
			if(arr.contains(prev)) {
				break;
			}
			ans+=prev;
		}
		if(i<n) {
			long sum=0;
			long sum1=0;
			long rem=(n-i+1)%(arr.size()-arr.indexOf(prev));
			for(int j=arr.indexOf(prev);j<arr.size();j++) {
				if(rem>0) 
					sum1+=arr.get(j);
				sum+=arr.get(j);
				rem--;
			}
			ans+=sum*((n-i+1)/(arr.size()-arr.indexOf(prev)))+sum1;
		}
		System.out.println(ans);
	}
}