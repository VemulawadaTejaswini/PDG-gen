
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(stdIn.next());
		int W = Integer.parseInt(stdIn.next());
		int H = Integer.parseInt(stdIn.next());
		int x = 0;
		int y = 0;
		int w = 0;
		int[] width = new int[W+1];
		int[] height = new int[H+1];
		boolean flag = false;
		for(int i=0;i<n;i++){
			x = Integer.parseInt(stdIn.next());
			y = Integer.parseInt(stdIn.next());
			w = Integer.parseInt(stdIn.next());
			boolean flag1 = false;
			boolean flag2 = false;
			int lx = Math.max(0,x-w);
			int hx = Math.min(W,x+w);
			int ly = Math.max(0,y-w);
			int hy = Math.min(H,y+w);
			width[lx]++;
			width[hx]--;
			height[ly]++;
			height[hy]--;
		}
		int count = 0;
		for(int i=0;i<W;i++){
			count += width[i];
			if(count<=0){
				flag = true;
			}
		}
		count = 0;
		for(int i=0;i<H;i++){
			count += height[i];
			if(count<=0 && flag){
				out.println("No");
				out.flush();
				return;
			}
		}
		out.println("Yes");
		out.flush();
	}
}