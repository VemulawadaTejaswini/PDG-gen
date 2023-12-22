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
		int r[]=new int[n];
		int c[]=new int[m];
		HashSet<Long> set = new HashSet<>();
		while(q-->0) {
			int x=inp.nextInt()-1;
			int y=inp.nextInt()-1;
			set.add(hash(x,y));
			r[x]++;
			c[y]++;
		}
		int maxXIndex=0,maxYIndex=0;
		for(int i=1;i<n;i++) {
			if(r[i]>r[maxXIndex]) {
				maxXIndex=i;
			}
		}
		for(int i=1;i<m;i++) {
			if(c[i]>r[maxYIndex]) {
				maxYIndex=i;
			}
		}
		int maxX=r[maxXIndex],maxY=c[maxYIndex];
		int gg=maxX+maxY-1;
		ArrayList<Integer> xs=new ArrayList<Integer>();
		ArrayList<Integer> ys=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			if(r[i]==maxX) xs.add(i);
		}
		for(int i=0;i<m;i++) {
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
    	return x*100000000l+y;
    }
		
}
