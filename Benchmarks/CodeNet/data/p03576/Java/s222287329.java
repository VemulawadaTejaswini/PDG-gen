import java.util.*;
public class Main {
	static int mod = (int)1e9+7;	
	static Map<Integer,Integer> x2y;
	static Map<Integer,Integer> y2x;
	static int xl[];
	static int yl[];
	static Map<Integer, Integer> deleteY;
	static Map<Integer, Integer> deleteX;
	static int sum , N, K;
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); K = sc.nextInt();
		long P[][] = new long[N][2];
		x2y = new HashMap<Integer,Integer>();
		y2x = new HashMap<Integer,Integer>();
		int xlm[] = new int[N];
		int ylm[] = new int[N];
		for(int i=0;i<N;i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			xlm[i]=x; ylm[i]=y;
			x2y.put(x,y); y2x.put(y,x);
		}
		sc.close();
		Arrays.sort(xlm);
		Arrays.sort(ylm);
			
		long ans = Long.MAX_VALUE;
		for(int l=0;l<=N;l++) {
			sum = N;
			xl = xlm.clone();
			yl = ylm.clone();
			deleteY = new HashMap<Integer, Integer>();;
			
			int lmin = xl[l];	
			removeY(l,true);//plus:true
			sum -= l;
			if(sumOut()) break;
			for(int r=0;r+l<N;r++) {
				int rmax = xl[N-1-r];
				removeY(r,false);//plus:true
				if(r!=0)sum --;
				if(sumOut()) break;
				boolean firstChoice = true;
				for(int u=0;u<N;u++) {
					int umax = yl[N-1-u];
					if(deleteY.containsKey(umax)) continue;
					if(!firstChoice)sum --;
					else firstChoice = false;
					if(sumOut()) break;
					
					boolean firstChoiceD = true;
					for(int d=0;u+d<N;d++) {	
						int dmin = yl[d];
						if(deleteY.containsKey(dmin)) continue;
						if(!firstChoiceD)sum --;
						else firstChoiceD = false;
						if(sumOut()) break;
						
						long Squ = ((long)rmax - lmin)*((long)umax-dmin);
						ans = Math.min(ans, Squ);
						
					}
				}
			}
		}
		System.out.println(ans);
	}


	static void removeY(int times, boolean plus) {
		if(plus) {
			for(int i=0;i<times;i++) {
				int keyX = xl[i];
				int valueY = x2y.get(keyX);
				if(!deleteY.containsKey(keyX))deleteY.put(valueY, 1);
			}
		}else {
			for(int i=0;i<times;i++) {
				int keyX = xl[N-1-i];
				int valueY = x2y.get(keyX);
				if(!deleteY.containsKey(keyX))deleteY.put(valueY, 1);
			}
		}
	}
	static boolean sumOut() {
		return sum<K;
	}

}