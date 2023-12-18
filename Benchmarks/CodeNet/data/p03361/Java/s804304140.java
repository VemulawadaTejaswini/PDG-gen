import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}
	static final int[] dx={0,1,0,-1},dy={1,0,-1,0};
	public static void main(String[]A){
		int h=gInt(),w=gInt();
		char[][] f=new char[h][w];
		for(int i=0;i<h;++i)
			s.next().getChars(0,w,f[i],0);
		for(int i=0;i<h;++i){
			loop:
			for(int j=0;j<w;++j){
				if(f[i][j]=='#'){
					for(int d=0;d<4;++d){
						int I=i+dy[d];
						int J=j+dx[d];
						if(0<=I&&I<h&&0<=J&&J<w&&f[I][J]=='#')
							continue loop;
					}
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
