
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		List <Data> T = new ArrayList<Data>();
		List <Data> A = new ArrayList<Data>();
		
		for(int i = 0 ; i < n ;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int c = b - a;
			Data p = new Data(a,c,i);
			Data q = new Data(b,-c,i);
			T.add(p); A.add(q);
		}
		
		Collections.sort(T);
		Collections.sort(A);
		
		BitSet eat = new BitSet(n);
		
		int ate = 0;
		
		int acnt = 0;
		int tcnt = 0;
		
		long Tall = 0;
		long Aall = 0;
		
		while(ate < n) {
			if(ate % 2 == 0) {
				if(!eat.get(T.get(tcnt).id())) {
					Tall += (long)T.get(tcnt).a();
					ate++;
					eat.set(T.get(tcnt).id());
					tcnt++;
				}
				else {
				tcnt++;
				}
			}
			else {
				if(!eat.get(A.get(acnt).id())) {
					Aall += (long)A.get(acnt).a();
					ate++;
					eat.set(A.get(acnt).id());
					acnt++;
				}
				else {
				acnt++;
				}
			}
		}
		
		System.out.println(Tall-Aall);
	}

}

class Data implements Comparable <Data> {
	
	private int a;
	private int c;
	private int id;
	
	public Data (int a,int c , int id) {
		this.a = a;
		this.c = c;
		this.id = id;
	}
	
	public int a() {
		return a;
	}
	public int c() {
		return c;
	}
	public int id() {
		return id;
	}
	
	@Override
	public int compareTo(Data o) {
		if(Integer.compare(o.a,a) != 0) {
			return Integer.compare(o.a,a);
		}
		
		return Integer.compare(o.c,c);
	}
}
