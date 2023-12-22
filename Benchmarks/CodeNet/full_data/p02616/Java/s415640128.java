

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int mod = 1000000007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		List <Integer> po = new ArrayList<Integer>();
		List <Integer> ne = new ArrayList<Integer>();
		
		for(int i = 0 ; i < n ;i++) {
			int a = Integer.parseInt(sc.next());
			if(a >= 0) {
				po.add(a);
			}
			else {
				ne.add(a);
			}
		}
		Collections.sort(po);
		Collections.sort(ne);
				
		long []pol = new long [po.size()+1];
		long []nel = new long [ne.size()+1];
		long []nel2 = new long [ne.size()+1];
		nel[0] = 1;
		pol[0] = 1;
		nel2[0] = 1;
		
		for(int i = 0 ; i < po.size() ;i++) {
			pol[i+1] = (long)(pol[i] * po.get(po.size()-i-1))%mod;
		}
		for(int i = 0 ; i < ne.size() ; i++) {
			nel[i+1] = (long)((mod-nel[i])* (mod-ne.get(i)))%mod;
			nel2[i+1] = (long)((mod-nel2[i])*(mod-ne.get(ne.size()-i-1)))%mod;
		}
		long ans = 0L;
		
		if(po.size()==0) {
			System.out.println(nel2[k]);
			return;
		}
		for(int i = 0 ; i <= Math.min(k, ne.size()) ; i+=2) {
			int t = k - i;
			if(t > po.size()) {
				continue;
			}
			long tmp = (long)(nel[i]*pol[t])%mod;
			ans = Math.max(tmp,ans);
		}
		
		System.out.println(ans);
	}
}
