import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();

		int map[][] = new int[H][W];


		for(int h=0;h<H;h++){
			for(int w=0;w<W;w++){
				map[h][w] = sc.nextInt();
			}
		}

		int Q = sc.nextInt();
		int ans[] = new int[Q];

		for(int q=0;q<Q;q++){
			int L = sc.nextInt();
			int R = sc.nextInt();

			int mp=0;
			int px=-1,py=-1;
			for(int n=L;n<=R;n+=D){
				int count=0;
				while(map[count/W][count%W] != n){
					count++;
				}
				if(px!=-1 && py!=-1){
					mp += res(py - count/W ,px - count %W);
				}
				px = count%W;
				py = count/W;
				
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