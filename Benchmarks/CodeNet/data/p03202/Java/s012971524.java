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
					if(map.get(a[i])!=null)map.put(a[i], map.get(a[i])+1);
					else map.put(a[i], 2);
					max=Math.max(max, map.get(a[i]));
				}
			}
		}
		
		
		System.out.println(max);
	}
	

}
