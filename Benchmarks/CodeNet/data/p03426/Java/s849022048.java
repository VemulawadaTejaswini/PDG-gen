import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();

		HashMap<Integer,Integer> maps = new HashMap<>();
		int rem[][] = new int[D][H*W/D+1];

		for(int d=0;d<D;d++){
			for(int n=0;n<H*W/D+1;n++){
				rem[d][n] = -1;
			}
		}

		for(int h=0;h<H;h++){
			for(int w=0;w<W;w++){
				int val = sc.nextInt();

				rem[val%D][val/D]= h*W + w;

			}
		}


		int Q = sc.nextInt();
		int ans[] = new int[Q];

		for(int q=0;q<Q;q++){
			int L = sc.nextInt();
			int R = sc.nextInt();
			if(L==R){
				ans[q] = 0;
				continue;
			}

			int mp=0;
			int px=-1,py=-1;
			for(int n=L;n<=R;n+=D){
				int k = rem[n%D][n/D];

				if(px!=-1 && py!=-1){
					mp += res(py - k/W ,px - k %W);
				}
				px = k%W;
				py = k/W;
				
			}

			ans[q] = mp;

		}

		for(int a : ans){
			System.out.println(a);
		}

	}

	private static int res(int h,int w){
		return Math.abs(h) + Math.abs(w);
	}
}