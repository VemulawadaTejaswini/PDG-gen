import java.util.Arrays;
import java.util.Scanner;

//Bingo
public class Main{

	int P, M, res, N;
	int[][][] a;
	int[][][] nums;
	int[] s, num;
	boolean[] used;
	
	boolean enableCheck(int i){
		int r = 0;
		for(int j=i+1;j<P;j++){
			boolean hit = false;
			for(int y=0;y<2*(M+1);y++){
				boolean e = true;
				for(int k=0;k<M;k++){
					boolean exist = false;
					for(int l=0;l<M;l++)if(nums[i][s[i]][k]==nums[j][y][l])exist = true;
					if(!exist)e = false;
				}
				if(e){
					hit = true; break;
				}
			}
			if(r==0 && !hit)r = 1;
			else if(r==1 && hit)r = 2;
		}
//		System.out.println("R:"+r);
		return r!=2;
	}
	
	void select(int k){
		if(k==P){
			N = 0;
			Arrays.fill(used, false);
			for(int i=0;i<P;i++)for(int j=0;j<M;j++){
				int x = nums[i][s[i]][j];
				if(!used[x]){
					used[x] = true;
					num[N++] = x;
				}
			}
			if(res<=N)return;
//			debug(s);
			if(P==4 && !enableCheck(0)){
//				System.out.println("Cut");
//				return;
			}
			Arrays.fill(used, false);
			if(f(0))res = N;
			return;
		}
		for(int i=0;i<2*(M+1);i++){
			s[k] = i;
			select(k+1);
		}
	}
	
	int state(){
		int r = 0;
		for(int i=0;i<P;i++){
			boolean b = bingo(i);
			if(r==0 && !b)r = 1;
			else if(r==1 && b)r = 2;
		}
		return r;
	}
	
	boolean bingo(int i){
		for(int j=0;j<2*(M+1);j++){
			boolean ok = true;
			for(int k=0;k<M;k++)if(!used[nums[i][j][k]])ok = false;
			if(ok)return true;
		}
		return false;
	}
	
	boolean f(int k){
		if(k==N){
			return true;
		}
		if(state()==2)return false;
		for(int i=0;i<N;i++){
			if(used[num[i]])continue;
			used[num[i]] = true;
			if(f(k+1))return true;
			used[num[i]] = false;
		}
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		used = new boolean[100];
		num = new int[20];
		s = new int[4];
		for(;;){
			P = sc.nextInt(); M = sc.nextInt();
			if((P|M)==0)break;
			a = new int[P][M][M];
			for(int i=0;i<P;i++)for(int j=0;j<M;j++)for(int k=0;k<M;k++)a[i][j][k]=sc.nextInt();
			nums = new int[P][2*(M+1)][M];
			for(int i=0;i<P;i++){
				for(int j=0;j<M;j++){
					for(int k=0;k<M;k++){
						nums[i][j][k] = a[i][k][j];
						nums[i][j+M][k] = a[i][j][k];
					}
					nums[i][2*M][j] = a[i][j][j];
					nums[i][2*M+1][j] = a[i][j][M-1-j];
				}
			}
			res = 100;
			select(0);
			System.out.println(res%100);
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}