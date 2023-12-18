
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		TreeMap<Integer,TreeSet<Integer>> tmap=new TreeMap<>(Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			int a=scn.nextInt();
			int b=scn.nextInt();
			if(a<=m) {
				if(tmap.containsKey(b)) {
					TreeSet<Integer> set=tmap.get(b);
					set.add(a);
					tmap.put(b, set);
				}else {
					TreeSet<Integer> set=new TreeSet<>(Collections.reverseOrder());
					set.add(a);
					tmap.put(b, set);

				}
			}
		}
		long reward=0;
		//System.out.println(tmap);
		if(tmap.size()>0) {
			while(m>0) {
				//System.out.println(m+" "+tmap);
				int x=tmap.firstKey();
				TreeSet<Integer> set=tmap.get(x);
				int y=set.pollFirst();
				if(m-y>=0) {
					reward+=x;
					m--;
				}else {
					break;
				}
				if(set.size()==0) {
					tmap.remove(x);
				}
			} 
		}
		System.out.println(reward);
	}

}
