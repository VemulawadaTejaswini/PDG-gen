import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Sheets
public class Main{

	class R{
		int x1, x2, type;
		public R(int x1, int x2, int type) {
			this.x1 = x1;
			this.x2 = x2;
			this.type = type;
		}
	}
	
	int n, r, area, len, INF = 1<<28;
	int[][] a;
	List<R>[] list;
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		a = new int[2][10000];
		list = new List[10001];
		for(;;){
			n = sc.nextInt(); r = sc.nextInt();
			if((n|r)==0)break;
			int minx = INF, maxx = -1, miny = INF, maxy = -1;
			area = len = 0;
			for(int i=0;i<=10000;i++)list[i] = new ArrayList<R>();
			for(int i=0;i<n;i++){
				int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
				minx = Math.min(minx, x1);
				maxx = Math.max(maxx, x2);
				miny = Math.min(miny, y1);
				maxy = Math.max(maxy, y2);
				list[y1].add(new R(x1, x2, 1));
				list[y2].add(new R(x1, x2, -1));
			}
			Arrays.fill(a[0], 0);
			int X = 1;
			for(int y=miny;y<=maxy+1;y++,X=1-X){
				for(int x=minx;x<maxx;x++)a[X][x]=a[1-X][x];
				for(R r:list[y]){
					for(int x=r.x1;x<r.x2;x++)a[X][x]+=r.type;
				}
				for(int x=minx;x<maxx;x++){
					if(0 < a[X][x]){
						area++;
						if(x==0 || a[X][x-1]==0)len++;
						if(x==9999 || a[X][x+1]==0)len++;
					}
					if(a[X][x]==0&&0<a[1-X][x] || 0<a[X][x]&&a[1-X][x]==0)len++;
				}
			}
			System.out.println(area);
			if(r==2)System.out.println(len);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}