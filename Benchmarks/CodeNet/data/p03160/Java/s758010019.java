import java.util.*;
public class Main{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int[] h = new int[n+1];
		for(int i=1;i<=n;i++){
			h[i] = scan.nextInt();
		}
		int[] dp = new int[n+1];
		
		int ans = jump(1,n,h);
		System.out.println(ans);
	}
	public static int jump(int i,int n,int []h){
//		System.out.println("start "+i);
		if(i==n) return 0;
		if(i>n) return (int)1e5;
		int k = 100005;
		int g = 100005;
		if(i+1<=n){
			k = Math.abs(h[i+1]-h[i])+jump(i+1,n,h);
			//System.out.println("k= "+k+" "+i+"->"+(i+1));
		}
		if(i+2<=n){
			g = Math.abs(h[i+2]-h[i])+jump(i+2,n,h);
			//System.out.println("g= "+g+" "+i+"->"+(i+2));
		}
		if(k<=g){
			//System.out.println("choosing "+(i+1)+" ending "+i);
			return k;
		}
		else{
			//System.out.println("choosing "+(i+2)+" ending "+i);
			return g;
		}

	}
}
