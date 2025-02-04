import java.util.*;

public class Main {
	int[] ans;
	
	int swap(int z, int x, int y){
		int sum = 0;
		int tx = -1;
		int ty = -1;
		int tz = -1;
		int ten = 1;
		for(int i=7;i>=0;i--){
			tz = z%10;
			if(i==x) tx = tz;
			else if(i==y) ty = tz;
			else sum += tz*ten;
			ten *= 10;
			z /= 10;
		}
		sum += tx*Math.pow(10, 7-y);
		sum += ty*Math.pow(10, 7-x);
		return sum;
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		ans = new int[76543211];
		Arrays.fill(ans, -1);
		ans[1234567] = 0;
		
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		que.offer(1234567);
		
		int zero = -1;
		int id, n, a;
		for(int cnt=0;;cnt++){
			int z = que.size();
			for(int i=0;i<z;i++){
				n = que.poll();
				ans[n] = cnt;
			
				a = n;
				for(int j=7;j>=0;j--){
					if(a%10==0) zero = j;
					a /= 10;
				}
				
				if(zero!=3 && zero!=7){
					id = swap(n, zero, zero+1);
					if(ans[id]==-1) que.offer(id);
				}
				if(zero!=0 && zero!=4){
					id = swap(n, zero, zero-1);
					if(ans[id]==-1) que.offer(id);
				}
				if(zero<4){
					id = swap(n, zero, zero+4);
					if(ans[id]==-1) que.offer(id);
				}else{
					id = swap(n, zero, zero-4);
					if(ans[id]==-1) que.offer(id);	
				}
			}
			if(que.size()==0) break;
		}
		
		while(sc.hasNext()){
			int ten = 10000000;
			int num = 0;
			for(int i=0;i<8;i++){
				num += sc.nextInt()*ten;
				ten /= 10;
			}
			System.out.println(ans[num]);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}