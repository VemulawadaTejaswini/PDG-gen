
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int []bulbs=new int[m+1];
		int []p=new int[m+1];
		//switches[1,n] -> bulbs[1,m]
		HashMap<Integer,HashSet<Integer>> hmap=new HashMap<>();
		for(int i=1;i<=m;i++) {
			int s=scn.nextInt();
			for(int j=0;j<s;j++) {
				int a=scn.nextInt();
				if(hmap.containsKey(a)) {
					HashSet<Integer> set=hmap.get(a);
					set.add(i);
					hmap.put(a, set);
				}else {
					HashSet<Integer> set=new HashSet<Integer>();
					set.add(i);
					hmap.put(a, set);
				}
			}
		}
		for(int i=1;i<=m;i++) {
			p[i]=scn.nextInt();
		}
		int x=0,y=0;
		int []b1=bulbs.clone();
		int []b2=bulbs.clone();
		x=solve(1,n,1,b1,p,hmap);
		//System.out.println("start");

		y=solve(0,n,1,b2,p,hmap);
		System.out.println(x+y);
	}
	public static int solve(int on,int n, int switch_idx, int []bulbs,int []p,HashMap<Integer,HashSet<Integer>> hmap) {
		
		int []b1=bulbs.clone();
		int []b2=bulbs.clone();
		
		// processing
		HashSet<Integer> set=hmap.get(switch_idx);
		if(set!=null) {
			Iterator<Integer> itr=set.iterator();
			while(itr.hasNext()) {
				int x=itr.next();
				bulbs[x]=(bulbs[x]+on)%2;
				b1[x]=bulbs[x];
				b2[x]=bulbs[x];
			}
		}
		if(switch_idx==n) {
			for(int i=1;i<bulbs.length;i++) {
				//System.out.println(bulbs[i]+" "+p[i]);
				if(bulbs[i]!=p[i]) {
					return 0;
				}
			}
			//System.out.println("end");
			return 1;
		}
//		System.out.println("Before"+" "+on+" "+switch_idx);
//		for(int i=0;i<b1.length;i++) {
//			System.out.print(b1[i]+" ");
//		}
//		System.out.println("b2222");
//		for(int i=0;i<b1.length;i++) {
//			System.out.print(b2[i]+" ");
//		}
//		System.out.println();
		// calling
		int x=0,y=0;
		x=solve(1,n,switch_idx+1,b1,p,hmap);
//		System.out.println("After"+" "+on+" "+switch_idx);
//		for(int i=0;i<b1.length;i++) {
//			System.out.print(b2[i]+" ");
//		}
//		System.out.println();
		y=solve(0,n,switch_idx+1,b2,p,hmap);
		return x+y;
	}
}
