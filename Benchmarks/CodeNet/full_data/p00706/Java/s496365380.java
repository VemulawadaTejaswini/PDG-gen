import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static Scanner s=new Scanner(System.in);
	
	static int w,h;
	public static void main(String[] __){
		while(true){
			int n=s.nextInt();
			if(n==0) return;
			w=s.nextInt();
			h=s.nextInt();
			int[][] f=new int[h+1][w+1];
			Point[] ps=new Point[n];
			for(int i=0;i<n;i++)
				ps[i]=new Point(s.nextInt(),s.nextInt());
			int ww=s.nextInt(),hh=s.nextInt();
			for(Point p:ps){
										f[p.y   ][p.x   ]++;
				if(izryt(p.y+hh,p.x   ))f[p.y+hh][p.x   ]--;
				if(izryt(p.y   ,p.x+ww))f[p.y   ][p.x+ww]--;
				if(izryt(p.y+hh,p.x+ww))f[p.y+hh][p.x+ww]++;
			}
			
			for(int[] v:f)
				Arrays.parallelPrefix(v,Integer::sum);
			
			int r=0;
			for(int i=0;i<=w;i++)
				for(int j=1;j<=h;j++){
					r=Math.max(r,f[j][i]+=f[j-1][i]);
					if(i>=ww&&j>=hh)
						r=Math.max(r,f[j][i]-f[j-hh][i]-f[j][i-ww]+f[j-hh][i-ww]);
				}
			//Arrays.stream(f).map(Arrays::toString).forEach(System.out::println);
			System.out.println(r);
		}
	}
	static boolean izryt(int y,int x){
		return 0<=y&&y<=h&&0<=x&&x<=w;
	}
}