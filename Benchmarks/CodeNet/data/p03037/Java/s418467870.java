import java.util.*;
import java.io.*;

class Main{
	static int n, m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		int l, r, count=0;
		Set<Integer> and = new HashSet<>();
		for(int i = 0; i < m; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			if(i==0) {
				and = hoge(l, r);
				continue;
			}

			and.retainAll(hoge(l, r));
			//System.out.println(and);
		}
		
		System.out.println(and.size());
	}
	
	static Set<Integer> hoge(int a, int b){
		Set<Integer> list = new HashSet<>();
		for(int i = a; i <= b; i++) {
			list.add(i);
		}
		//System.out.println(list);
		return list;
	}
}