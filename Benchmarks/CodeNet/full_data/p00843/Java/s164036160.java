import java.util.Arrays;
import java.util.Scanner;

//Bingo
public class Main{

	int p, m, min;
	int[][] a;
	int[][] m3 = {{0,1,2}, {3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
	int[][] m4 = {{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15},{0,4,8,12},{1,5,9,13},{2,6,10,14},{3,7,11,15},{0,5,10,15},{3,6,9,12}};
	int mask3[] = {0x0007, 0x0038, 0x01c0, 0x0049, 0x0092, 0x0124, 0x0111, 0x0054};
	int mask4[] = {0x000f, 0x00f0, 0x0f00, 0xf000, 0x1111, 0x2222, 0x4444, 0x8888, 0x8421, 0x1248};
	int[] order, last;
	
	boolean bingo(int k){
		int res = 0;
		for(int i=0;i<m*m;i++)if(mark[a[k][i]])res|=1<<i;
		if(m==3){
			for(int i=0;i<mask3.length;i++)if((res&mask3[i])==mask3[i])return true;
		}
		else {
			for(int i=0;i<mask4.length;i++)if((res&mask4[i])==mask4[i])return true;
		}
		return false;
	}
	
	boolean[] mark;
	
	boolean f(int k){
		if(k==p){
			Arrays.fill(mark, false);
			for(int i=0;i<p;i++){
				if(m==3){
					for(int j=0;j<m;j++)if(last[i]!=m3[order[i]][j])mark[a[i][m3[order[i]][j]]]=true;
				}
				else{
					for(int j=0;j<m;j++)if(last[i]!=m4[order[i]][j])mark[a[i][m4[order[i]][j]]]=true;
				}
			}
			
			for(int i=1;i<p;i++)if(bingo(i))return false;
			for(int i=0;i<p;i++){
				mark[a[i][last[i]]] = true;
				for(int j=i+1;j+1<p;j++)if(!bingo(j)&&bingo(j+1))return false;;
			}
			int c = 0;
			for(boolean x:mark)if(x)c++;
			min = Math.min(min, c);
//			return true;
			return false;
		}
		for(int i=0;i<m;i++){
			last[k] = m==3?m3[order[k]][i]:m4[order[k]][i];
			if(f(k+1))return true;
		}
		return false;
	}
	
	void dfs(int k){
		if(k==p){
			f(0);
			return;
		}
		if(m==3)for(int i=0;i<m3.length;i++){
			order[k] = i; 
			dfs(k+1);
		}
		else for(int i=0;i<m4.length;i++){
			order[k] = i;
			dfs(k+1);
		}
	}
	
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			p = sc.nextInt(); m = sc.nextInt();
			if((p|m)==0)break;
			a = new int[p][m*m];
			for(int i=0;i<p;i++)for(int j=0;j<m*m;j++)a[i][j]=sc.nextInt();
			order = new int[p];
			last = new int[p];
			min = 1<<29;
			mark = new boolean[101];
			dfs(0);
			System.out.println(min==1<<29?0:min);
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}