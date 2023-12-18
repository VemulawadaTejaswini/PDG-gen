import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	static int[][]f;
	static final int[]dx={1,0,-1,0},dy= {0,1,0,-1};
	public static void main(String[]$){
		int h=getInt(),w=getInt();
		if(h==1&&w==1) {
			System.out.println(1);
			return;
		}
		
		f=new int[h][w];
		int n=getInt();
		for(int i=1;i<=n;++i) {
			final int am=getInt();
			ArrayDeque<Point>p=new ArrayDeque<>();
			p.add(getStart());
			for(int l=0;l<am;++l) {
				Point poll=p.poll();
				f[poll.x][poll.y]=i;
				for(int d=0;d<4;++d)
					if(0<=poll.x+dx[d]&&poll.x+dx[d]<h
					&&0<=poll.y+dy[d]&&poll.y+dy[d]<w
					&&f[poll.x+dx[d]][poll.y+dy[d]]==0)
						p.add(new Point(poll.x+dx[d],poll.y+dy[d]));
			}
		}
		Arrays.stream(f).map(o->Arrays.stream(o).mapToObj(String::valueOf).collect(Collectors.joining(" ")))
				.forEach(System.out::println);
	}
	private static Point getStart(){
		for(int i=0;i<f.length;++i)
			for(int j=0;j<f[1].length;++j)
				if(f[i][j]==0)
					return new Point(i,j);
		throw new IllegalStateException();
	}
}