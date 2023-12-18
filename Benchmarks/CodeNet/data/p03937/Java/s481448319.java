import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	static IntStream REPS(int r){
		return IntStream.range(0,r);
	}
	static IntStream REPS(int l,int r){
		return IntStream.rangeClosed(l,r);
	}
	static IntStream INTS(int l){
		return REPS(l).map(i->getInt());
	}
	
	
	static final int[] dx={-1,0,1,0},dy={0,1,0,-1};
	
	static int h=getInt(),w=getInt();
	public static void main(String[] __){
		char[][] f=REPS(h).mapToObj(i->s.next().toCharArray())
				.toArray(char[][]::new);
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				for(int d=0;d<4;d++){
					boolean b=false;
					if(izryt(i+dy[d],j+dx[d])&&f[i+dy[d]][j+dx[d]]=='#'){
						if(b){
							System.out.println("Impossible");
						}
						b=true;
					}
				}
			}
		}
		System.out.println("Possible");
	}
	static boolean izryt(int y,int x){
		return 0<=y&&y<h&&0<=x&&x<w;
	}
}
