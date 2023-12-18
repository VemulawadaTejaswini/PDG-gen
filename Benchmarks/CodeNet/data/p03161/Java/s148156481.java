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

			f[i-1] = 9999999;
			h[i-1] = sc.nextInt();
			
			for(int j=1;j<=K;j++){
				
				if(j > i-1){
					break;
				}
				int f_ik =Math.abs(h[i-1]-h[i-1-j]) + f[i-1-j];
				f[i-1] = chmin(f[i-1],f_ik);
			}
			

			//f[i-1] = flog2(i-1,K,h,f);
		}

		System.out.println(f[N-1]);
	}
  	
  	public static int chmin(int a,int b){

		if(a <= b){	
			return a;
		}else{
			return b;
		}
	}
}