import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int h=s.nextInt(),w=s.nextInt();

		int[][] vertical=new int[h][w];
		int[][] horizontal=new int[h][w];
		for(int i=0;i<h;++i){
			String t=s.next();
			for(int j=0;j<w;++j){
				vertical[i][j]=horizontal[i][j]=t.charAt(j)=='.'?1:0;
			}
		}

		for(int i=0;i<h;++i){
			for(int j=1;j<w;++j){
				if(horizontal[i][j]>0)
					horizontal[i][j]+=horizontal[i][j-1];
			}
			for(int j=w-2;j>=0;--j){
				if(horizontal[i][j]>0&&horizontal[i][j+1]>0)
					horizontal[i][j]=horizontal[i][j+1];
			}
		}
		for(int j=0;j<w;++j){
			for(int i=1;i<h;++i){
				if(vertical[i][j]>0)
					vertical[i][j]+=vertical[i-1][j];
			}
			for(int i=h-2;i>=0;--i){
				if(vertical[i][j]>0&&vertical[i+1][j]>0)
					vertical[i][j]=vertical[i+1][j];
			}
		}
		System.out.println(
				IntStream.range(0,h*w).map(i->vertical[i/w][i%w]+horizontal[i/w][i%w])
				.max().getAsInt()-1
				);
	}
}