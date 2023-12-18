import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long[] h = new long[N];
		long max = 0;
		for(int i=0;i<N;i++){
			h[i] = sc.nextLong();
			if(max<h[i])
				max = h[i];
		}
		long left = 0;
		long right = max / B;
		long T = left + (right - left) / 2;
		while(left<=right){
			T = left + (right - left) / 2;
			if(checkDefeat(h,A,B,T)){
				if(!checkDefeat(h,A,B,T-1))
					break;
				right = T - 1;
			}else
				left = T + 1;
		}
		System.out.println(T);
	}

	public static boolean checkDefeat(long[] h,long A,long B,long T){
		boolean defetable = true;
		long t = 0;
		for(int i=0;i<h.length;i++){
			long temp = (h[i]-B*T)/(A-B);
			t += (h[i]-B*T)%(A-B)==0?temp:(h[i]-B*T)/(A-B)+1;
			if(t>T){
				defetable = false;
				break;
			}
		}
		return defetable;
	}

}
