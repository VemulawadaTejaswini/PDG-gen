import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] h = new int[N];
		int max = 0;
		for(int i=0;i<N;i++){
			h[i] = sc.nextInt();
			if(max<h[i])
				max = h[i];
		}
		int upT = max/B+1;
		int downT = 1;
		int T = (upT+downT)/2;
		while(true){
			int nextT = -1;
			if(checkDefeat(h,A,B,T)){
				upT = T;
				nextT = (T+downT)%2==0?(T+downT)/2:(T+downT)/2+1;
			}else{
				downT = T;
				nextT = (T+upT)%2==0?(T+upT)/2:(T+upT)/2+1;
			}
			if(T == nextT)
				break;
			T = nextT;
		}
		System.out.println(T);
	}

	public static boolean checkDefeat(int[] h,int A,int B,int T){
		boolean defetable = true;
		int t = 0;
		for(int i=0;i<h.length;i++){
			int temp = (h[i]-B*T)/(A-B);
			t += (h[i]-B*T)%(A-B)==0?temp:temp+1;
			if(t>T){
				defetable = false;
				break;
			}
		}
		return defetable;
	}

}
