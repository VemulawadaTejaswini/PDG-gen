import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N,M;
		N = sc.nextInt();
		M = sc.nextInt();
		int x,y;
		x=1;
		y =1;
		for (int i=0;i<N;i++) {
			x=x*2;
		}
		for (int i=0;i<M;i++) {
			y=y*2;
		}
		x--;
		y--;
		StringBuffer sb = new StringBuffer(y);
		for (int j =0;j<y;j++) {
			if (j==1 || j==3||j==7|| j==15||j==31|| j==63||j==127|| j==255||j==511) {
				sb.append("0");
			} else {
				sb.append("1");
			}
		}
		StringBuffer sbx = new StringBuffer(y);
		for (int j =0;j<y;j++) {
			sbx.append("1");
		}
		for (int j =0;j<x;j++) {
			if (j==1 || j==3||j==7|| j==15||j==31|| j==63||j==127|| j==255||j==511) {
				System.out.println(sb);
			} else {
				System.out.println(sbx);
			}
		}
	}
}
