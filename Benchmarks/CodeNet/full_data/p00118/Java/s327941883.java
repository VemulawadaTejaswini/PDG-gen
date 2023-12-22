import java.util.Scanner;
public class Main {
	static int[][] change(int[][] f,int hh,int ww,int h,int w){
		int mark = f[hh][ww];
		f[hh][ww] = 3;
		if(hh>0)
			if(f[hh-1][ww]==mark) change(f,hh-1,ww,h,w);
		if(hh<h-1)
			if(f[hh+1][ww]==mark) change(f,hh+1,ww,h,w);
		if(ww>0)
			if(f[hh][ww-1]==mark) change(f,hh,ww-1,h,w);
		if(ww<w-1)
			if(f[hh][ww+1]==mark) change(f,hh,ww+1,h,w);
		return f;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int h= sc.nextInt();
			int w = sc.nextInt();
			if(h+w==0)break;
			
			int[][] field = new int[h][w];
			for(int i=0;i<h;i++) {
				String str = sc.next();
				for(int j=0;j<w;j++) {
					char a = str.charAt(j);
					if(a=='#')
						field[i][j] = 0;	//柿
					else if(a=='*')
						field[i][j] = 1;	//蜜柑
					else
						field[i][j] = 2;	//林檎
				}
			}
			
			int cnt = 0;
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(field[i][j]!=3) {
						cnt++;
						int mark = field[i][j];
						change(field,i,j,h,w);
						field[i][j] = mark;
					}
				}
			}

			System.out.println(cnt);
		}
	}

}

