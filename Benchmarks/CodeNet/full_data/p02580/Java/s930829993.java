//No sorceries shall prevail.
import java.util.*;
import java.io.*;
public class Main {

	static Scanner inp= new Scanner(System.in);
	static PrintWriter out= new PrintWriter(System.out);
	public static void main(String args[]) {		    	
	   	Main g=new Main();
	   	g.main();
	   	out.close();
	}

	
	
	//Main
	void main() {
		
		int n=inp.nextInt();
		int m=inp.nextInt();
		int q=inp.nextInt();
		int r[]=new int[n+1];
		int c[]=new int[m+1];
		HashSet<Long> set = new HashSet<>();
		while(q-->0) {
			int x=inp.nextInt();
			int y=inp.nextInt();
			set.add(hash(x,y));
			r[x]++;
			c[y]++;
		}
		int maxX=0,maxY=0;
		for(int i=0;i<=n;i++) {
			maxX=Math.max(maxX, r[i]);
		}
		for(int i=0;i<=m;i++) {
			maxY=Math.max(maxY, c[i]);
		}
		int gg=maxX+maxY-1;
		ArrayList<Integer> xs=new ArrayList<>();
		ArrayList<Integer> ys=new ArrayList<>();
		for(int i=0;i<=n;i++) {
			if(r[i]==maxX) xs.add(i);
		}
		for(int i=0;i<=m;i++) {
			if(c[i]==maxY) ys.add(i);
		}
		loop:
		for(int x: xs) {
			for(int y: ys) {
				if(!set.contains(hash(x,y))) {
					gg++;
					break loop;
				}
			}
		}
		System.out.println(gg);
	}
    
    static long hash(int x, int y) {
    	return x*1000000000l+y;
    }
		
}
