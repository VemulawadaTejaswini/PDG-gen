import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		MySet S=new MySet();
		int q=Integer.parseInt(in.next());
		for(int i=0;i<q;i++) {
			int odr=Integer.parseInt(in.next());
			
			switch(odr) {
			case 0:
				int x0=Integer.parseInt(in.next());
				S.add(x0);
				out.println(S.size());
				break;
				
			case 1:
				int x1=Integer.parseInt(in.next());
				out.println((S.contains(x1))? 1 : 0);
				break;
				
			case 2:
				int x2=Integer.parseInt(in.next());
				S.remove(x2);
				break;
				
			case 3:
				int l=Integer.parseInt(in.next()),r=Integer.parseInt(in.next());
				for(int j=l;j<=r;j++) {
					if(S.index[j]) out.println(j);
				}
			}
		}
		out.flush();
	}

}

class MySet{
	boolean index[];int size;
	
	MySet(){
		index=new boolean[1000000001];
		Arrays.fill(index, false);
		size=0;
	}
	
	void add(int x) {
		if(!index[x]) {
			index[x]=true;
			size++;
		}
	}
	
	int size() {
		return this.size;
	}
	
	boolean contains(int x) {
		return index[x];
	}
	
	void remove(int x) {
		if(index[x]) {
			index[x]=false;
			size--;
		}
		
	}
	
	List<Integer> dump(int a,int b) {
		List<Integer> ls=new ArrayList<>();
		for(int i=a;i<=b;i++) {
			if(index[i]) ls.add(i);
		}
		
		return ls;
	}
}

