import java.util.*;

import java.math.*;

public class Main {

	public static long solve(long[] arr1,long[] arr2, int k) {

		Queue<Long> a1=new LinkedList<>();
		Queue<Long> a2=new LinkedList<>();
		long ans=0;
		long count=0;
		for(long u:arr1)
			a1.add(u);
		for(long u:arr2)
			a2.add(u);

		boolean up=true;
		while(ans<k && up) {
			up=false;
			if(a1.size()==0 || a2.size()==0)
				break;
			if(a1.peek()<=a2.peek()) {
				if(a1.peek()+ans<=k) {
					ans+=a1.poll();
					count++;
					up=true;
					
				}
			}else {
				if(a2.peek()+ans<=k) {
					ans+=a2.poll();
					count++;
					up=true;
				}
			}

		}
		while(a1.size()>0) {
			if(a1.peek()+ans<=k) {
				ans+=a1.poll();
				count++;
			}else break;
		}
		while(a2.size()>0) {
			if(a2.peek()+ans<=k) {
				ans+=a2.poll();
				count++;
			}
			else break;
		}

		return count;
	}

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		int t=1;
		while(t-->0) {
			int n=s.nextInt();
			int m=s.nextInt();
			int k=s.nextInt();
			long[] arr1=new long[n];
			long[] arr2=new long[m];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i]=s.nextLong();
			}
			for (int i = 0; i < arr2.length; i++) {
				arr2[i]=s.nextLong();
			}
			System.out.println(solve(arr1,arr2,k));
		}


	}
}

