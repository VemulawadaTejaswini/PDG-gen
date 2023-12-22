import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Doll[] d;
	static int[][] memo;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N = cin.nextInt();
			if(N==0){
				break;
			}
			int maxh=0,maxr=0;
			Doll[] tmp = new Doll[N];
			for(int i = 0;i<N;i++){
				int a = cin.nextInt();
				int b = cin.nextInt();
				maxh=Math.max(maxh,a);
				maxr=Math.max(maxr,b);
				tmp[i]=new Doll(a,b);
			}

			N = N + cin.nextInt();
			d = new Doll[N];
			for(int i = 0;i<tmp.length;i++){
				d[i]=tmp[i];
			}

			for(int i = tmp.length;i<N;i++){
				int a = cin.nextInt();
				int b = cin.nextInt();
				maxh=Math.max(maxh,a);
				maxr=Math.max(maxr,b);
				d[i]=new Doll(a,b);
			}
			Arrays.sort(d);
			memo = new int[maxh+1][maxr+1];
			for(int i = 0;i<maxh+1;i++){
				for(int j = 0;j<maxr+1;j++){
					memo[i][j]=-1;
				}
			}
			for(int i = 0;i<N;i++){
				//System.out.println(d[i].h + " " + d[i].r);
			}
			System.out.println(search(maxh,maxr));
		}

	}
	static int search(int h,int r){
		//System.out.println(h+" " +r);
		int hh=0, rr=0, max=0;
		for(int i =0;i<d.length;i++){
			if(d[i].h >= h || d[i].r >= r){
				break;
			}
			else{
				hh=d[i].h;
				rr=d[i].r;
				if(memo[hh][rr]==-1){
					memo[hh][rr]=search(hh,rr)+1;
				}
				max = Math.max(memo[hh][rr], max);
			}
		}
		if(hh==0&&rr==0){
			return 1;
		}
		return max;
	}
}

class Doll implements Comparable{
	int h;
	int r;
	Doll(int a,int b){
		h=a;
		r=b;
	}
	public int compareTo(Object o){
		Doll d = (Doll)o;
		if(this.h==d.h){
			return this.r-d.r;
		}
		else{
			return this.h-d.h;
		}
	}
}