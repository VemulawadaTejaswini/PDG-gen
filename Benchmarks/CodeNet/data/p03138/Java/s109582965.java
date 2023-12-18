import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long A[] = new long[N];
		for(int i=0;i<N;i++)A[i]=sc.nextLong();
		sc.close();
	
		//以下の方法でXを作ることで、答えを最大にしうるXを無駄なく全探索する。
		//方法：
		// Kを上から見て、基本的にはKに一致させるようにXを作成していく。
		// ただし、途中Kのある桁が１のとき、Xの同桁を０にする。
		// すると、それより下の桁はどう選んでもXがKを越えない。
		// したがって見ている桁について、貪欲に、A1~ANの１の数が０の数より大きければ０、そうでなければ１として良い。
		
		// 以上から、Kのある桁iが１の時に、Xの同桁を最初に０とするようなiを全部試す。（全探索する）
		
		//桁の操作には関係ないが、あとで使うのでA_1~A_Nの各桁の１の数を調べておく。
		long cnt1[] = new long[61]; 
		for(int d = 60;d >= 0;d--) {
			for(int i=0;i<N;i++) {
				long a = A[i];
				if((a>>d & 1)==1) cnt1[d]++;
			}
		}
	
		long ans = 0;
		
		for(int d = 60;d >= -1;d--) { //dはXの桁を上から見ていくための添字。d==-1とすると、Kに完全に一致する場合を一緒に表現できる。
			long res = 0;
			if((K>>d&1)!=1 && d!=-1) continue; //上からd桁目が1でない（つまり0）ならXの同桁も0にするだけ。その場合の最大値は以降のループに含まれる。また、別で全一致の状態を調べるために最後のd=-1のときだけは以下の処理を行う。
			//Kの、上からd桁目が1のとき
			//Xの同桁を0にし、上の桁はKに一致、下の桁は答えが最大になるように決める。ループで作りながら答えを求める。
			for(int e = 60;e>=0;e--) {
				long tmp = 0;
				if(e>d) { //Kに一致させる
					if((K>>e & 1)==1) tmp += N - cnt1[e];
					else tmp += cnt1[e];
				}
				else if(e==d) { //０にするということ
					tmp += cnt1[e];
				}
				else { //答えを最大化するように０と１を選ぶ
					tmp += Math.max(cnt1[e], N-cnt1[e]);
				}
				res += tmp << e;
			}
			ans = Math.max(ans, res);
		}
		
		System.out.println(ans);

	}
}
