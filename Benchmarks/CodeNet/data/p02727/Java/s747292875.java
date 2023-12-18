// No sorceries shall prevail. //           
import java.util.*;
import java.io.*;
public class Main {
	
	static long gcd(long a, long b) { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    }
	static int gcd(int a, int b) { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    }
	
	static long mod = 1000000007;
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		
		int x=inp.nextInt();
		int y=inp.nextInt();
		int a=inp.nextInt();
		int b=inp.nextInt();
		int c=inp.nextInt();
		long p[]=new long[a];
		long q[]=new long[b];
		long r[]=new long[c];
		long gg=0;
		for(int i=0;i<a;i++) {
			p[i]=inp.nextInt();
		}
		for(int i=0;i<b;i++) {
			q[i]=inp.nextInt();
		}
		for(int i=0;i<c;i++) {
			r[i]=inp.nextInt();
		}
		Arrays.sort(r);
		Arrays.sort(p);
		Arrays.sort(q);
		int mustEatX=Math.max(0, x-c);
		int mustEatY=Math.max(0, y-c);
		for(int i=0;i<mustEatX;i++) {
			gg+=p[a-1-i];
		}
		for(int i=0;i<mustEatY;i++) {
			gg+=q[b-1-i];
		}
		int xin=a-1-mustEatX;
		int yin=b-1-mustEatY;
		int cin=c-1;
		int aeaten=mustEatX,ceaten=0;
		int beaten=mustEatY;
		
		for(int i=mustEatX+mustEatY;i<x+y;i++) {
			if(aeaten<x && beaten<y && ceaten<c && p[a-1-aeaten]>=q[b-1-beaten] && p[a-1-aeaten]>=r[c-1-ceaten]) {
				gg+=p[a-1-aeaten];
				aeaten++;
			} 
			else if(aeaten<x && beaten<y && ceaten<c && p[a-1-aeaten]<=q[b-1-beaten] && q[b-1-beaten]>=r[c-1-ceaten]){
				gg+=q[b-1-beaten];
				beaten++;
			} 
			else if(aeaten<x && beaten<y && ceaten<c && p[a-1-aeaten]<=r[c-1-ceaten] && q[b-1-beaten]<=r[c-1-ceaten]){
				gg+=r[c-1-ceaten];
				ceaten++;
			}else if(aeaten<x && beaten<y && p[a-1-aeaten]>=q[b-1-beaten]) {
				gg+=p[a-1-aeaten];
				aeaten++;
			}else if(aeaten<x && beaten<y && p[a-1-aeaten]<=q[b-1-beaten]) {
				gg+=q[b-1-beaten];
				beaten++;
			}else if(aeaten<x && ceaten<c && p[a-1-aeaten]>=r[c-1-ceaten]) {
				gg+=p[a-1-aeaten];
				aeaten++;
			}else if(aeaten<x && ceaten<c && p[a-1-aeaten]<=r[c-1-ceaten]) {
				gg+=r[c-1-ceaten];
				ceaten++;
			}else if(ceaten<c && beaten<y && r[c-1-ceaten]>=q[b-1-beaten]) {
				gg+=r[c-1-ceaten];
				ceaten++;
			}else if(ceaten<c && beaten<y && r[c-1-ceaten]<=q[b-1-beaten]) {
				gg+=q[b-1-beaten];
				beaten++;
			}else if(aeaten<x) {
				gg+=p[a-1-aeaten];
				aeaten++;
			}else if(beaten<y) {
				gg+=q[b-1-beaten];
				beaten++;
			}else {
				gg+=r[c-1-ceaten];
				ceaten++;
			}
		}
		
		
		out.println(gg);
		out.close();
		inp.close();
	}
}