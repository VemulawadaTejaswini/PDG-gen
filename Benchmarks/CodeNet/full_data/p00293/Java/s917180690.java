import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int h[]=new int[N];
		int m[]=new int[N];
		for(int i=0;i<N;i++){
			h[i]=scan.nextInt();
			m[i]=scan.nextInt();
		}
		
		int M=scan.nextInt();
		int q[]=new int[N+M];
		
		for(int i=0; i<N; i++){
			q[i] = h[i]*60 + m[i];
		}
		int k[]=new int[M];
		int g[]=new int[M];
		for(int i=0;i<M;i++){
			k[i]=scan.nextInt();
			g[i]=scan.nextInt();
			q[N+i] = k[i]*60 + g[i];
		}
		
		int r = 0;
		for(int i=0; i<N+M; i++){
			for(int j=i+1; j<N+M; j++){
				if(q[i]>q[j]){
					r = q[i];
					q[i] = q[j];
					q[j] = r;
				}
			}
		}
		
		for(int i=0; i<N+M; i++){
			String s = String.valueOf(q[i]%60);
			if(i==M+N-1){
				if(s.length() == 1){
					System.out.println(q[i]/60 + ":0" + q[i]%60);
				}else{
					System.out.println(q[i]/60 + ":" + q[i]%60);
				}
			}else{
				if(q[i+1] != q[i]){
					if(s.length() == 1){
						System.out.print(q[i]/60 + ":0" + q[i]%60 + " ");
					}else{
						System.out.print(q[i]/60 + ":" + q[i]%60 + " ");
					}
				}
			}
		}
	}
}