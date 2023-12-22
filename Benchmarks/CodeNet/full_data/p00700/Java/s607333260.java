import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner scn = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		int N = scn.nextInt();
		int x,y;
		int maxx,maxy;
		for(int k=0;k<N;k++){
			maxx=0;
			maxy=0;
			x=0;
			y=0;
			while(true){
				int tmpx=scn.nextInt();
				int tmpy=scn.nextInt();
				if(tmpx==0&&tmpy==0){
					break;
				}
				x+=tmpx;
				y+=tmpy;
				if(maxx*maxx+maxy*maxy<x*x+y*y||(maxx*maxx+maxy*maxy==x*x+y*y&&maxx<x)){
					maxx=x;
					maxy=y;
				}
			}
			pr.println(maxx+" "+maxy);
		}
		pr.flush();
		scn.close();
	}

}