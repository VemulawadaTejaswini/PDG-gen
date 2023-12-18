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
	public static ArrayList<Sushi> al = new ArrayList<Sushi>();
	public static int N = 0;
	public static long C = 0;
	public static long ans = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		C = sc.nextLong();
		if(N==1){
			long position = sc.nextLong();
			long value = sc.nextLong();
			long distance = Math.min(position, C-position);
			if(value > distance) System.out.println(value-distance);
			else System.out.println(0);
			return;
		}
		
		for(int i=0;i<N;++i) al.add( new Sushi(sc.nextLong(),sc.nextLong()) );
		Collections.sort( al, new Comparator<Sushi>(){
	        public int compare(Sushi a, Sushi b){
	          if(a.x >= b.x) return 1;
	          else return -1;
	        }
	    });
		
		/*long now = 0;
		long ans = 0;
		for(int i=0;i<N;++i){ //右回り
			if(i==0) now -= al.get(0).x;
			else now -= (al.get(i).x - al.get(i-1).x);
			now += al.get(i).v;
			if(now>ans) ans = now;
		}
		
		now = 0;
		for(int i=N-1;i>=0;--i){ //左回り
			if(i==N-1) now -= (C - al.get(N-1).x);
			else now -= (al.get(i+1).x - al.get(i).x);
			now += al.get(i).v;
			if(now>ans) ans = now;
		}*/
		dfs(0,al.get(0).v-al.get(0).x,1,N-1,'R',false);
		dfs(N-1,al.get(N-1).v-C+al.get(N-1).x,0,N-2,'L',false);
		System.out.println(ans);
		
		/*for(int i=0;i<N;i++){
			System.out.println(al.get(i).x+" "+al.get(i).v);
		}*/
		return;
	}
	
	public static void dfs(int nowX,long nowV,int left,int right,char dir,boolean changed){
		if(nowV>ans) ans = nowV;
		if(left<=right){
			if(!changed){
				if(dir == 'R'){
					dfs(left,nowV+al.get(left).v-dist(al.get(nowX).x,al.get(left).x,dir,'R'),left+1,right,'R',false);
					dfs(right,nowV+al.get(right).v-dist(al.get(nowX).x,al.get(right).x,dir,'L'),left,right-1,'L',true);
				}else{
					dfs(right,nowV+al.get(right).v-dist(al.get(nowX).x,al.get(right).x,dir,'L'),left,right-1,'L',false);
					dfs(left,nowV+al.get(left).v-dist(al.get(nowX).x,al.get(left).x,dir,'R'),left+1,right,'R',true);
				}
			}else{
				if(dir == 'R') dfs(left,nowV+al.get(left).v-dist(al.get(nowX).x,al.get(left).x,dir,'R'),left+1,right,'R',true);
				else dfs(right,nowV+al.get(right).v-dist(al.get(nowX).x,al.get(right).x,dir,'L'),left,right-1,'L',true);
			}
		}
		return;
	}
	
	public static long dist(long x1,long x2,char dir,char to){
		if(dir=='R'&&to=='R') return x2-x1;
		if(dir=='L'&&to=='L') return x1-x2;
		else return C - Math.abs(x1-x2);
	}
}