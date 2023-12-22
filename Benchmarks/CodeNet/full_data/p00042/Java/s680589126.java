import java.util.Scanner;

class Main {
	public static  void DT(int count){
		for(int i=0;i<N;i++){
			for(int j=0;j<W+1;j++){
				if(j<w[i]){
					niji[i+1][j] = niji[i][j];
				}else{
					niji[i+1][j] = Math.max(niji[i][j],niji[i][j-w[i]]+v[i]);
				}
			}
		}

		for(int i=W;i>0;i--){
			if(niji[N][i]>niji[N][i-1]){
				System.out.println("Case "+count+":");
				System.out.println(niji[N][i]);
				System.out.println(i);
				break;
			}
		}
	}
	

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		count = 0;
		String temp;
		while(sc.hasNextInt()){
			temp=sc.nextLine();
			W = Integer.valueOf(temp);
			if(W==0)break;
			
			
			temp=sc.nextLine();
			N = Integer.valueOf(temp);
			w = new int[N];
			v = new int [N];
			
			
			
			String[] s;
			for(int i=0;i<N;i++){
				s = sc.nextLine().split(",");
				v[i] = Integer.valueOf(s[0]);
				w[i] = Integer.valueOf(s[1]);
			}
			niji = new int[N+1][W+1];
			count++;
			DT(count);
		}
	}
	static  int W,N,count;
	static int[] w;
	static int[] v;
	static int[][] niji;
}