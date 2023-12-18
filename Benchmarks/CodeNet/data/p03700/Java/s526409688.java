import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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
		long right = max;
		long T = 0;
		while(left < right){
			T = (right + left) / 2;
			if(checkDefeat(h,A,B,T)){
				if(!checkDefeat(h,A,B,T-1))
					break;
				right = T - 1;
			}else{
				left = T + 1;
			}
		}
		System.out.println(T);
		sc.close();
	}

	public static boolean checkDefeat(long[] h,long A,long B,long T){
		long t = 0;
		for(int i=0;i<h.length;i++){
			if(h[i]>B*T){
				double temp = (h[i] - (B*T));
				t += temp % (A-B) == 0 ? temp / (A-B) : temp / (A-B) + 1;
				if(t>T){
					return false;
				}
			}
		}
		return true;
	}

}
