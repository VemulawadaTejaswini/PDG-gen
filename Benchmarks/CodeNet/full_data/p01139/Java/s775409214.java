import java.util.Scanner;

public class Main {

	static int width, height, count=0;
	static char[][] field;
	static boolean[][] v;
	static boolean wbool, bbool;

	static void visit(int x, int y) {
		if(field[x][y]=='B') bbool=true;
		if(field[x][y]=='W') wbool=true;
		if(field[x][y]!='.') return;
		if(v[x][y]) return;
		v[x][y]=true;
		count++;
		if(x<height-1)
			visit(x+1, y);
		if(x>0)
			visit(x-1, y);
		if(y<width-1)
			visit(x, y+1);
		if(y>0)
			visit(x, y-1);
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				width=sc.nextInt();
				height=sc.nextInt();
				if(width==0) break;
				field=new char[height+1][width+1];
				v=new boolean[height+1][width+1];
				for(int i=0; i<height; i++) {
					String str=sc.next();
					for(int j=0; j<width; j++) {
						field[i][j]=str.charAt(j);
					}
				}
				int wcount=0, bcount=0;
				for(int i=0; i<height; i++) {
					for(int j=0; j<width; j++) {
						if(v[i][j]) {
							continue;
						}
						if(field[i][j]!='.') {
							continue;
						}
						wbool=false;
						bbool=false;
						count=0;
						visit(i, j);
						if(wbool && ! bbool) {
							wcount+=count;
						}
						else if(bbool && ! wbool) {
							bcount+=count;
						}
					}
				}
				System.out.println(bcount+" "+wcount);
			}


		}
	}
}
