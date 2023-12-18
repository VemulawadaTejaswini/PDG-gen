package src;
import java.util.*;
import java.util.function.LongBinaryOperator;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		long[][] ina = new long[Integer.parseInt(s.next())][Integer.parseInt(s.next())],
		         inb = new long[ina.length][ina[0].length];
		long result = 0;
		for(int i=0;i<ina.length;i++)
			for(int j=0;j<ina[0].length;j++) {
				ina[i][j]=Integer.parseInt(s.next());
				inb[i][j]=ina[i][j];
			}
		//out(ina);
		if(ina.length==1) {
			Arrays.parallelPrefix(ina[0], (LongBinaryOperator) (left, right) -> left+right);
			return;
		}
		if(ina[0].length==1) {
			int i=0;
			for(long j:ina[0]) {
				i+=j;
			}
			return;
		}

		search(ina);

		//out(ina);

		result+=ina[ina.length-1][ina[0].length-1];

		{
			int x=inb[0].length-1,y=inb.length-1;
			while(true) {
				inb[y][x]=0;
				if(x==0) {
					for(int i=0;i<y;i++) {
						inb[i][0]=0;
					}
					break;
				}
				if(y==0) {
					Arrays.fill(inb[0],0,x, 0);
					break;
				}
				if(ina[y-1][x]>ina[y][x-1]) {
					y--;
				}else {
					x--;
				}
			}
		}
		//out(inb);
		search(inb);
		//out(inb);

		result+=inb[inb.length-1][inb[0].length-1];

		System.out.println(result);
		{
			int x=inb[0].length-1,y=inb.length-1;
			while(true) {
				inb[y][x]=0;
				if(x==0) {
					for(int i=0;i<y;i++) {
						inb[i][0]=0;
					}
					break;
				}
				if(y==0) {
					Arrays.fill(inb[0],0,x, 0);
					break;
				}
				if(inb[y-1][x]>inb[y][x-1]) {
					y--;
				}else {
					x--;
				}
			}
		}
		//out(inb);
	}
	static void search(long[][] in) {
		for(int i=0;i<in.length-1;i++) {
			in[i+1][0]+=in[i][0];
		}
		for(int i=0;i<in[0].length-1;i++) {
			in[0][i+1]+=in[0][i];
		}
		for(int i=1;i<in.length;i++) {
			for(int j=1;j<in[0].length;j++) {
				in[i][j]+=Math.max(in[i-1][j], in[i][j-1]);
			}
		}
	}
	static void out(long[][] in) {
		for(long[] i:in)
			System.out.println(Arrays.toString(i));
		System.out.println();
	}
}
