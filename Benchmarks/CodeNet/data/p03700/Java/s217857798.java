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
		long left = 0;
		long right = max/B + 1;
		long T = left + (right - left) / 2;
		while(left<=right){
			T = left + (right - left) / 2;
			if(checkDefeat(h,A,B,T))
				right = T - 1;
			else
				left = T + 1;
		}
		System.out.println(T);
	}

	public static boolean checkDefeat(int[] h,int A,int B,long T){
		boolean defetable = true;
		long t = 0;
		for(int i=0;i<h.length;i++){
			long temp = (h[i]-B*T)/(A-B);
			t += (h[i]-B*T)%(A-B)==0?temp:temp+1;
			if(t>T){
				defetable = false;
				break;
			}
		}
		return defetable;
	}

}
