import java.util.Scanner;
public class Main {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //コマの数
		int M = sc.nextInt(); //座標
		int ML[] = new int[M]; 
		int MS[] = new int[M-1];
		int MScounter[] = new int[M-1];
		for(int i = 0; i<M; i++) {
			ML[i] = sc.nextInt();
		}
		for(int i = 0; i<M-1; i++) {
			for(int j =M-1; j>i; j--) {
				if(ML[j-1]>ML[j]) {
					int q = ML[j-1];
					ML[j-1] = ML[j];
					ML[j] = q;
				}
			}
		}
		int c0;
		int c1;
		int sa;
		for(int c =0; c<M-1; c++) {
			if(ML[c]>0) c0 = ML[c];else c0= -1*ML[c];
			if(ML[c+1]>0) c1 = ML[c+1];else c1= -1*ML[c+1];
			if(c0>c1) sa = c0-c1;else sa = c1-c0;
			//上のは絶対値
			MS[c] = sa;
		}
		int max=0;
		int maxidx =0;
		if(M>N) {
		for(int p = 0; p<N-1; p++) {
			
			max =0;
			maxidx =0;
			for(int i=0; i<M-1; i++) {
				if(MS[i]>max) {
					max =MS[i];
					maxidx = i;
				}
			}
			MS[maxidx] =0;
		}
		}
		int sum=0;
		for(int c = 0; c<M-1; c++) {
			sum += MS[c];
		}
		System.out.println(sum);
		
		
	}
}
			
