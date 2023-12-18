import java.util.Scanner;

public class Main {

  	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int f[] = new int[N];
		int h[] = new int[N];

		h[0] = sc.nextInt();
		h[1] = sc.nextInt();

		f[1-1] = 0;
		f[2-1] = Math.abs(h[2-1] - h[1-1]);

		for(int i=3;i<=N;i++){

			f[i-1] = -1;
			h[i-1] = sc.nextInt();

			f[i-1] = flog2(i-1,K,h,f);
		}

		System.out.println(f[N-1]);
	}

	public static int flog2(int i,int k,int[] h,int[] f){

		if(f[i] != -1){
			return f[i];
		}
		else{
			int ret_f = 9999999;
			
			if(k > i){
				k = i;
			}

			for(int j=1;j<=k;j++){
				int f_ik =Math.abs(h[i]-h[i-j]) + f[i-j];
				ret_f = chmin(ret_f,f_ik);
			}

			//return Math.min(f_i1, f_i2);
			return ret_f;
		}
	}


	public static int chmin(int a,int b){

		if(a <= b){
			return a;
		}else{
			return b;
		}
	}
}