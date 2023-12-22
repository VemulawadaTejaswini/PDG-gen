import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] HWM = br.readLine().split(" ");
		
		int H = Integer.parseInt(HWM[0]);
		int W = Integer.parseInt(HWM[1]);
		int M = Integer.parseInt(HWM[2]);
		
		HashSet<Long> Bakuha = new HashSet<Long>();
		long MaxH = 3*100000;
		int[]sumH = new int[H];
		int[]sumW = new int[W];
		int SH = 0;
		int SW = 0;
		
		for(int i = 0; i<M; i++) {
			String[] HW = br.readLine().split(" ");
			int inH = Integer.parseInt(HW[0])-1;
			int inW = Integer.parseInt(HW[1])-1;
			Bakuha.add((inH*MaxH)+inW); 
			sumH[inH] ++;
			sumW[inW] ++;
			if(sumH[inH]>= SH) {
				SH = sumH[inH];
			} 
			if(sumW[inW]>= SW) {
				SW = sumW[inW];
			}
		}
		
		ArrayList<Integer> SHindex = new ArrayList<Integer>();
		ArrayList<Integer> SWindex = new ArrayList<Integer>();
		
		for(int h=0; h<H; h++) {
			if(sumH[h] == SH) {
				SHindex.add(h);
			}
		}	
		for(int w=0; w<W; w++) {
			if(sumW[w] == SW) {
				SWindex.add(w);
			}	
		}
		
		int ans = SH+SW-1;//最低の爆破可能数、鳩の巣に被っている
		int I = SHindex.size();
		int J = SWindex.size();
		
		if((long)SHindex.size()*SWindex.size() > M) {//鳩の巣Mより交点の数が大きいとき
			ans = SH+SW;
		}else {//鳩の巣Mより交点の数が小さいとき、交点は鳩の巣に被っているかもしれない
			for(int i=0; i<I; i++) {
				long SHnakami = SHindex.get(i)*MaxH;
				for(int j=0; j<J; j++) {
					if (!Bakuha.contains(SHnakami+SWindex.get(j))) { //HashMapに既にキーがないとき、鳩の巣に被っていない
						ans = SH+SW;
					}
				}
			}
		}
		
		System.out.print(ans);
	}
}