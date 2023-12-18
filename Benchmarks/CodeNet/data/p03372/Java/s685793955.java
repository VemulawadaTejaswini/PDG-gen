


import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long C=sc.nextLong();
		long[][] sushi=new long[N][2];
		long[][] migi=new long[N][2];
		long[][] hidari=new long[N][2];

		long max_cal=0;
		for(int i=0; i<N; i++) {
			sushi[i][0]=sc.nextLong();
			sushi[i][1]=sc.nextLong();
		}
		//右回り

		migi[0][0]=sushi[0][0];
		migi[0][1]=sushi[0][1];
		for(int i=1; i<N; i++) {
			migi[i][0]=sushi[i][0];
			migi[i][1]=migi[i-1][1]+sushi[i][1];	//累積和
		}
		//スタート地点よりも左側に行かない時
		for(int i=0; i<N; i++) {
			migi[i][1]-=migi[i][0];		//１回分のキョリを引く
			if(migi[i][1]>=0) {
				max_cal=Math.max(max_cal, migi[i][1]);
			}
		}

		//左のとある地点まで行く場合
		hidari[0][0]=C-sushi[N-1][0];
		hidari[0][1]=sushi[N-1][1];
		for(int i=1; i<N; i++) {
			hidari[i][0]=C-sushi[N-1-i][0];		//逆周りなので一番最初にxN
			hidari[i][1]=hidari[i][1]+sushi[N-1-i][1];
		}

		long[][] gyaku=new long[N][2];		//左のどこまで行くのが最善化をもとめる 0得られるカロリー  1得られる地点(ダブリングを防ぐ為)
		if(hidari[0][1]-hidari[0][0]>0) {
			gyaku[0][0]=hidari[0][1]-hidari[0][0];
			gyaku[0][1]=0;
		}
		else {
			gyaku[0][0]=0;
			gyaku[0][1]=-1;	//行くな
		}
		for(int i=1; i<N; i++) {
			if(hidari[i][1]-hidari[i][0]>gyaku[i-1][0]) {		//ここがある意味DPテーブルみたいな感じ
				gyaku[i][0]=hidari[i][1]-hidari[i][0];
				gyaku[i][1]=i;
			}
			else {
				gyaku[i][0]=gyaku[i-1][0];		//今までよりも先に行った結果損したなら行かないほうが得
				gyaku[i][1]=gyaku[i-1][1];
			}
		}

		for(int i=0; i<N-1; i++) {		//右側の行く地点を固定して、左側に最大利益で行けるとこまで行く。		N-1まで（実質N-2）なのは、N-1まで右回りで行ったら左に向かっていない（向かうと無駄）なので
			migi[i][1]-=migi[i][0];		//右にいく　そして　左へ向かう時の2回目の分を引く
			long tmp=migi[i][1]+gyaku[N-2-i][0];
			max_cal=Math.max(tmp,max_cal);
		}
		//右回り終了

		//左回り
		hidari=new long[N][2];
		migi=new long[N][2];
		hidari[0][0]=C-sushi[N-1][0];
		hidari[0][1]=sushi[N-1][1];
		//System.out.println("hidari[0][0] "+hidari[0][0]+"  hidari[0][1] "+hidari[0][1]);
		for(int i=1; i<N; i++) {
			hidari[i][0]=C-sushi[N-1-i][0];
			hidari[i][1]=hidari[i-1][1]+sushi[N-1-i][1];	//累積和
			//System.out.println("hidari["+i+"][0] "+hidari[i][0]+"  hidari["+i+"][1] "+hidari[i][1]);
		}
		//スタート地点よりも右側に行かない時
		for(int i=0; i<N; i++) {
			hidari[i][1]-=hidari[i][0];		//１回分のキョリを引く
			if(hidari[i][1]>=0) {
				max_cal=Math.max(max_cal, hidari[i][1]);
			}
		}

		//右のとある地点まで行く場合
		migi[0][0]=sushi[0][0];
		migi[0][1]=sushi[0][1];
		for(int i=1; i<N; i++) {
			migi[i][0]=sushi[i][0];		//逆周りなので一番最初にx1が来る
			migi[i][1]=migi[i-1][1]+sushi[i][1];		//累積和
			//System.out.println("migi["+i+"][0] "+migi[i][0]+"  migi["+i+"][1] "+migi[i][1]);
		}

		//long[][] gyaku=new long[N][2];		//右のどこまで行くのが最善化をもとめる 0得られるカロリー  1得られる地点(ダブリングを防ぐ為)
		if(migi[0][1]-migi[0][0]>0) {
			gyaku[0][0]=migi[0][1]-migi[0][0];		//得られるカロリー
			gyaku[0][1]=0;
		}
		else {
			gyaku[0][0]=0;
			gyaku[0][1]=-1;	//行くな
		}
		//System.out.println("gyaku[0][0] "+gyaku[0][0]+"  gyaku[0][1] "+gyaku[0][1]);
		for(int i=1; i<N; i++) {
			if(migi[i][1]-migi[i][0]>gyaku[i-1][0]) {		//ここがある意味DPテーブルみたいな感じ
				gyaku[i][0]=migi[i][1]-migi[i][0];
				gyaku[i][1]=i;
			}
			else {
				gyaku[i][0]=gyaku[i-1][0];		//今までよりも先に行った結果損したなら行かないほうが得
				gyaku[i][1]=gyaku[i-1][1];
			}
			//System.out.println("gyaku["+i+"][0] "+gyaku[i][0]+"  gyaku["+i+"][1] "+gyaku[i][1]);
		}

		for(int i=0; i<N-1; i++) {		//左側の行く地点を固定して、左側に最大利益で行けるとこまで行く。		N-1まで（実質N-2）なのは、N-1まで左回りで行ったら右に向かっていない（向かうと無駄）なので
			hidari[i][1]-=hidari[i][0];		//左にいく　そして　右へ向かう時の2回目の分を引く
			long tmp=hidari[i][1]+gyaku[N-2-i][0];
 			//System.out.println(tmp+" "+i+" "+(N-2-i));
			max_cal=Math.max(tmp,max_cal);
		}
				//左回り終了
		System.out.println(max_cal);

	}
}








/*




import java.util.Scanner;

class D96{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long C=sc.nextLong();
		long[][] sushi=new long[N][2];
		long[][] migi=new long[N][2];
		long[][] hidari=new long[N][2];

		long max_cal=0;
		for(int i=0; i<N; i++) {
			sushi[i][0]=sc.nextLong();
			sushi[i][1]=sc.nextLong();
		}
		//右回り

		migi[0][0]=sushi[0][0];
		migi[0][1]=sushi[0][1];
		for(int i=1; i<N; i++) {
			migi[i][0]=sushi[i][0];
			migi[i][1]=migi[i-1][1]+sushi[i][1];	//累積和
		}
		//スタート地点よりも左側に行かない時
		for(int i=0; i<N; i++) {
			migi[i][1]-=migi[i][0];		//１回分のキョリを引く
			if(migi[i][1]>=0) {
				max_cal=Math.max(max_cal, migi[i][1]);
			}
		}

		//左のとある地点まで行く場合
		hidari[0][0]=C-sushi[N-1][0];
		hidari[0][1]=sushi[N-1][1];
		for(int i=1; i<N; i++) {
			hidari[i][0]=C-sushi[N-1-i][0];		//逆周りなので一番最初にxN
			hidari[i][1]=hidari[i][1]+sushi[N-1-i][1];
		}

		long[][] gyaku=new long[N][2];		//左のどこまで行くのが最善化をもとめる 0得られるカロリー  1得られる地点(ダブリングを防ぐ為)
		if(hidari[0][1]-hidari[0][0]>0) {
			gyaku[0][0]=hidari[0][1]-hidari[0][0];
			gyaku[0][1]=0;
		}
		else {
			gyaku[0][0]=0;
			gyaku[0][1]=-1;	//行くな
		}
		for(int i=1; i<N; i++) {
			if(hidari[i][1]-hidari[i][0]>gyaku[i-1][0]) {		//ここがある意味DPテーブルみたいな感じ
				gyaku[i][0]=hidari[i][1]-hidari[i][0];
				gyaku[i][1]=i;
			}
			else {
				gyaku[i][0]=gyaku[i-1][0];		//今までよりも先に行った結果損したなら行かないほうが得
				gyaku[i][1]=gyaku[i-1][1];
			}
		}

		for(int i=0; i<N-1; i++) {		//右側の行く地点を固定して、左側に最大利益で行けるとこまで行く。		N-1まで（実質N-2）なのは、N-1まで右回りで行ったら左に向かっていない（向かうと無駄）なので
			migi[i][1]-=migi[i][0];		//右にいく　そして　左へ向かう時の2回目の分を引く
			long tmp=migi[i][1]+gyaku[N-2-i][0];
			max_cal=Math.max(tmp,max_cal);
		}
		//右回り終了

		//左回り
		hidari[0][0]=C-sushi[N-1][0];
		hidari[0][1]=sushi[N-1][1];
		for(int i=1; i<N; i++) {
			hidari[i][0]=C-sushi[N-1-i][0];
			hidari[i][1]=hidari[i-1][1]+sushi[N-1-i][1];	//累積和
		}
		//スタート地点よりも右側に行かない時
		for(int i=0; i<N; i++) {
			hidari[i][1]-=hidari[i][0];		//１回分のキョリを引く
			if(hidari[i][1]>=0) {
				max_cal=Math.max(max_cal, hidari[i][1]);
			}
		}

		//右のとある地点まで行く場合
		migi[0][0]=sushi[0][0];
		migi[0][1]=sushi[0][1];
		for(int i=1; i<N; i++) {
			migi[i][0]=sushi[i][0];		//逆周りなので一番最初にx1
			migi[i][1]=migi[i][1]+sushi[i][1];		//累積和
		}

		//long[][] gyaku=new long[N][2];		//右のどこまで行くのが最善化をもとめる 0得られるカロリー  1得られる地点(ダブリングを防ぐ為)
		if(migi[0][1]-migi[0][0]>0) {
			gyaku[0][0]=migi[0][1]-migi[0][0];		//得られるカロリー
			gyaku[0][1]=0;
		}
		else {
			gyaku[0][0]=0;
			gyaku[0][1]=-1;	//行くな
		}

		for(int i=1; i<N; i++) {
			if(migi[i][1]-migi[i][0]>gyaku[i-1][0]) {		//ここがある意味DPテーブルみたいな感じ
				gyaku[i][0]=migi[i][1]-migi[i][0];
				gyaku[i][1]=i;
			}
			else {
				gyaku[i][0]=gyaku[i-1][0];		//今までよりも先に行った結果損したなら行かないほうが得
				gyaku[i][1]=gyaku[i-1][1];
			}
		}

		for(int i=0; i<N-1; i++) {		//左側の行く地点を固定して、左側に最大利益で行けるとこまで行く。		N-1まで（実質N-2）なのは、N-1まで左回りで行ったら右に向かっていない（向かうと無駄）なので
			hidari[i][1]-=hidari[i][0];		//左にいく　そして　右へ向かう時の2回目の分を引く
			long tmp=hidari[i][1]+gyaku[N-1-i][0];
			max_cal=Math.max(tmp,max_cal);
		}

				//左回り終了
		System.out.println(max_cal);

	}
}



*/