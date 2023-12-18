import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main{
	static Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}
	static class Pair<T,U>{
		T l;U r;
		Pair(T L,U R){l=L;r=R;}
		T getL(){return l;}
		U getR(){return r;}
	}


	static final int h=getInt(),w=getInt(),n=getInt(),a[]=INS(n).toArray();
	public static void main(String[]$){
		int[][]f=new int[h][w];
		Arrays.stream(f).forEach(o->Arrays.fill(o,-1));
		int x=0,y=0,dx=1,dy=0;

		int color=0;
		try {
			while(true){
				--a[color];
				f[y][x]=color+1;
				if(a[color]==0)++color;

				x+=dx;y+=dy;

				if(x==w-1) {
					if(y%2==0) {
						dx=0;
						dy=1;
					}else {
						dx=-1;
						dy=0;
					}
				}
				if(x==0) {
					if(y%2==1){
						dx=0;
						dy=1;
					}else {
						dx=1;
						dy=0;
					}
				}
			}
		}catch (Exception e) {
		}
		Arrays.stream(f).map(
				o->Arrays.stream(o)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(" "))
				).forEach(System.out::println);
	}
}