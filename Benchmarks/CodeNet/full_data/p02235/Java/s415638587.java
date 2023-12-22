import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
	

	public void exec() throws IOException {
		int[] lcs = new int[1000000];
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int q = Integer.parseInt(br.readLine());
		String x,y;
		int lenx,leny;
		char x0,y0;
		for(int i=0; i<q; i++) {
			x = br.readLine();
			y = br.readLine();
			lenx = x.length();
			leny = y.length();
			x0=x.charAt(0);
			y0=y.charAt(0);
			lcs[0] = (x0==y0) ? 1 : 0;
			for(int x2=1; x2<lenx; x2++){
				lcs[x2] = (lcs[x2-1]==1 || x.charAt(x2)==y.charAt(0)) ? 1 : 0;
			}
			for(int y2=1; y2<leny; y2++){
				lcs[y2*lenx] = (lcs[(y2-1)*lenx]==1 || x.charAt(0)==y.charAt(y2)) ? 1 : 0;
			}
			for(int x2=1; x2<lenx; x2++) {
				for(int y2=1; y2<leny; y2++) {
					if(x.charAt(x2)==y.charAt(y2)){
						lcs[x2+y2*lenx] = lcs[(x2-1)+(y2-1)*lenx]+1;
					}else{
						lcs[x2+y2*lenx] = Math.max(lcs[x2+(y2-1)*lenx],lcs[(x2-1)+y2*lenx]);
					}
				}
			}
			out.println(lcs[(lenx-1)+(leny-1)*lenx]);
		}
		out.flush();
	}
}