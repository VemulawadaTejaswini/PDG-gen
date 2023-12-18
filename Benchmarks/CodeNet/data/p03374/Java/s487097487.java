import java.util.*;
 
class Sushi{
	long v;
	long x;
	public Sushi(long a,long b){
		x = a;
		v = b;
	}
}

public class Main{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long C = sc.nextLong();
		long ans = 0;
		if(N==1){
			long position = sc.nextLong();
			long value = sc.nextLong();
			long distance = Math.min(position, C-position);
			if(value > distance) System.out.println(value-distance);
			else System.out.println(0);
			return;
		}
		
		public static ArrayList<Sushi> al = new ArrayList<Sushi>();
		for(int i=0;i<N;++i) al.add( new Sushi(sc.nextLong(),sc.nextLong()) );
		Collections.sort( al, new Comparator<Sushi>(){
	        public int compare(Sushi a, Sushi b){
	          if(a.x >= b.x) return 1;
	          else return -1;
	        }
	    });
		
		long[] calL = new long[N];
		cal[0] = al.get(0).v;
		for(int i=0;i<N;++i){
			cal[i] = cal[i-1] + al.get(i).v;
			cal[i] -= al.get(i).x;
		}
		cal[0] -= al.get(0).x;	
		long[] calR = new long[N];
		cal[N-1] = al.get(N-1).v;
		for(int i=N-1;i>=0;-i){
			cal[i] = cal[i+1] + al.get(i).v;
			cal[i] -= (C-al.get(i).x);
		}
		cal[N-1] -= (C-al.get(N-1).x);
		
		long[] maxL = new long[N];
		maxL[0] = Math.max(0, calL[0]);
		for(int i=0;i<N;++i) maxL[i] = Math.max(calL[i], max[i-1]);	
		ans = Math.max(ans, maxL[N-1]);
		long[] maxR = new long[N];
		maxR[N-1] = Math.max(0, calR[N-1]);
		for(int i=N-1;i>=0;--i) maxR[i] = Math.max(calR[i], max[i+1]);
		ans = Math.max(ans, maxR[0]);
		
		long now = 0;
		for(int i=0;i<N-1;++i){
			now += al.get(i).v;
			ans = Math.max(ans, maxR[i+1]+now-2*al.get(i).x);
		}
		now = 0;
		for(int i=N-1;i>0;--i){
			now += al.get(i).v;
			ans = Math.max(ans, maxL[i-1]+now-2*(C-al.get(i).x));
		}
		
		System.out.println(ans);
		return;
	}
}