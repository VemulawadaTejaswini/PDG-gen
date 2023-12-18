import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		Map<Long, Integer> map=new HashMap<Long,Integer>();
		int max=1;
		for(int i=0;i<n;++i) {
			a[i]=sc.nextLong();
			if(i!=0) {
				if(a[i]<=a[i-1]) {
					if(map.get(a[i])!=null) {
						long k=a[i];
						while (map.get(k)!=null&&map.get(k)==max&&k!=0)--k;
						if (k==0)k=a[i];
						else if(map.get(k)!=null)map.put(k, map.get(k)+1);
						else map.put(k,2);
						max=Math.max(max, map.get(k));
					}
					else map.put(a[i], 2);
					max=Math.max(max, map.get(a[i]));
				}
			}
		}
		
		
		System.out.println(max);
	}
	

}
