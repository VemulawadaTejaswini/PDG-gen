import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int N;
	int[]a; //max4800
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a=new int[N];
		int[] color=new int[8];
		
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
			if(a[i]<2800)color[a[i]/400]++;
			else color[7]++;
		}
		int cnt=0;
		for(int i=0;i<7;i++){
			if(color[i]>0)cnt++;
		}
		
		if(color[7]>0){
			if(cnt+color[7]>8)System.out.println((cnt+1)+" "+8);
			else System.out.println((cnt+1)+" "+(cnt+color[7]));
		}else{
			System.out.println(cnt+" "+cnt);
		}
	}

}
