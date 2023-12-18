import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
		int per = (H*W)%D;
		int[] hl = new int[H*W];
		int[] wl = new int[H*W];

		//ArrayList<Integer> data = new ArrayList<Integer>();
		/*for(int i =0;i<H*W;i++){
			data.add(sc.nextInt());
		}*/

		for(int h=0;h<H;h++){
			for(int w =0;w<W;w++){
				int A =sc.nextInt();
				hl[A] = h;
				wl[A] = w;
			}
		}

		ArrayList<ArrayList<Integer>> costarray = new ArrayList<ArrayList<Integer>>();
		for(int d=1;d<=D;d++){
			ArrayList<Integer> cost = new ArrayList<Integer>();
			cost.add(0);
			int mp = 0;
			int hoge=-1;
			int x=0;
			int y=0;
			int i=0;
			int j=0;
			if(d <= per){
				hoge =0;
			}
			for(int a =0;a<(H*W)/D+hoge;a++){
				int num = d+a*D;
				/*if(a==0){
					x = data.lastIndexOf(num)/W+1;
					y = data.lastIndexOf(num)%W+1;
				}
				i = data.lastIndexOf(num+D)/W+1;
				j = data.lastIndexOf(num+D)%W+1;*/
				if(a==0){
					x =hl[num];
					y =wl[num];
				}
				i = hl[num+D];
				j = wl[num+D];
				mp = mp + Math.abs(x-i) + Math.abs(y-j);
				cost.add(mp);
				x = i;
				y = j;
			}
			costarray.add(cost);
		}

		int Q = sc.nextInt();
		for(int i=0;i<Q;i++){
			int L=sc.nextInt();
			int R=sc.nextInt();
			int LL=(L-1)%D;
			int ans = costarray.get(LL).get((R-1)/D)-costarray.get(LL).get((L-1)/D);
			System.out.println(ans);
		}
		sc.close();
	}
}
