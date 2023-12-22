import java.util.Arrays;
import java.util.Scanner;

//Swimming Jam
public class Main{

	class R implements Comparable<R>{
		int speed, lap, now;
		public R(int speed, int lap) {
			this.speed = speed;
			this.lap = lap;
		}
		public int compareTo(R o) {
			return o.speed-speed;
		}
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			R[] r = new R[n];
			for(int i=0;i<n;i++)r[i]=new R(sc.nextInt(), sc.nextInt()*2);
			Arrays.sort(r);
			int[][] lane = new int[n][400*250];
			int[][] begin = new int[n][501];
			int t = 0, res = 0;
			for(int i=1;i<=r[0].lap;i++){
				begin[0][i] = t;
				for(int j=0;j<r[0].speed;j++){
					lane[0][t++] = i;
				}
				res = Math.max(res, t);
			}
			//Ú
			for(int i=1;i<n;i++){
				t = 0;
//				int p = 0;
				for(int j=1;j<=r[i].lap;j++){
					begin[i][j] = t;
//					System.out.println("Begin:"+i+" J:"+j+" at:"+t);
					for(int k=0;k<r[i].speed;k++){
						lane[i][t++] = j;
					}
					int max = t;
					for(int k=0;k<i;k++){
						if(lane[k][t-1]==0)continue;
						if(j%2!=lane[k][t-1]%2)continue;
						int x = lane[k][t-1];
						if(begin[i][j]<=begin[k][x])continue;
						int pos = t;
						while(lane[k][pos]==x)pos++;
						max = Math.max(max, pos);
					}
					while(t<max)lane[i][t++] = j;
					res = Math.max(res, t);
//					while(p<i&&lane[p][t]==0)p++;
//					if(p==i){
//						res = Math.max(res, t);
//						continue;
//					}
//					if(lane[p][t-1]%2!=j%2){
//						res = Math.max(res, t);
//						continue;
//					}
//					if(begin[i][j]<=begin[p][lane[p][t-1]]){
//						res = Math.max(res, t);
//						continue;
//					}
//					int x = lane[p][t-1];
//					while(lane[p][t]==x){
//						lane[i][t++] = j;
//					}
//					res = Math.max(res, t);
				}
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}