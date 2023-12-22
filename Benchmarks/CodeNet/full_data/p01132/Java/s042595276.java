import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner scn = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		int cnt= 0;
		while(true){
			int S = scn.nextInt();
			if(S==0) break;
			if(cnt!=0) pr.println();
			cnt++;
			int[] c = new int[4];
			for(int k=0;k<4;k++){
				c[k] = scn.nextInt();
			}
			int M = c[3]*500+c[2]*100+c[1]*50+c[0]*10;
			S=M-S;
			if(S/500>0){
				if(S/500>=c[3]){
					S-=500*c[3];
					c[3]=0;
				}else{
					c[3]-=S/500;
					S= S%500;
				}
			}
			if(S/100>0){
				if(S/100>=c[2]){
					S-=100*c[2];
					c[2]=0;
				}else{
					c[2]-=S/100;
					S= S%100;
				}
			}
			if(S/50>0){
				if(S/50>=c[1]){
					S-=50*c[1];
					c[1]=0;
				}else{
					c[1]-=S/50;
					S= S%50;
				}
			}
			if(S/10>0){
				if(S/10>=c[0]){
					S-=10*c[0];
					c[0]=0;
				}else{
					c[0]-=S/10;
					S= S%10;
				}
			}
			if(c[0]!=0){
				pr.println(10+" "+c[0]);
			}
			if(c[1]!=0){
				pr.println(50+" "+c[1]);
			}
			if(c[2]!=0){
				pr.println(100+" "+c[2]);
			}
			if(c[3]!=0){
				pr.println(500+" "+c[3]);
			}
		}
		pr.flush();
		scn.close();
	}

}