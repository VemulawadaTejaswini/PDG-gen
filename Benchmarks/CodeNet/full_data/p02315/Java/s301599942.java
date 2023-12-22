import java.util.Scanner;
//POJ 1979 DFS
public class Main{
	static int N;
	static int W;
	static int w[];
	static int v[];
	static int dp[][];
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		W = scan.nextInt();
		dp=new int[N+1][10001];
		w=new int[N+1];
		v=new int[N+1];
		for(int i=0;i<N;i++){
			v[i]=scan.nextInt();
        	w[i]=scan.nextInt();
        }
        System.out.println(rec(0,W));
	}
	
	public static int rec(int item,int weight) {
		if(dp[item][weight]>0) {
			return dp[item][weight];
		}
		int res;
		if(item==N) {
			res = 0;
			//weightは残りの重さ
		}else if(weight<w[item]) {
			res = rec(item+1, weight);
		}else {
			res = Math.max(rec(item+1, weight),rec(item+1, weight-w[item])+v[item]);
		}
		return dp[item][weight]=res;
	}
}
