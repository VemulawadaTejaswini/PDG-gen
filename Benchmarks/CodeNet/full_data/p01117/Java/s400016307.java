import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
期末試験の成績
私は，中学校の教師である． ちょうど期末試験が終わったところで，すべての科目について全生徒の点数が手元にある．
どれぐらい高い合計点を得た生徒がいるのか知りたいのだが，科目ごとの得点データになっているので，作業が容易でない．
そこで，優秀なプログラマであるあなたに手助けしてほしい．
具体的には，合計点が最も高い生徒の合計点を求めるプログラムを書いてほしい．

Input
入力は複数のデータセットからなる． 各データセットは次の形式で表される．

n m
p1,1 p1,2 … p1,n
p2,1 p2,2 … p2,n
…
pm,1 pm,2 … pm,n
データセットの最初の行は，二つの整数 n と m からなる．
n は生徒の人数 (1 ≤ n ≤ 1000)，m は科目数 (1 ≤ m ≤ 50) である．
それに続く m 行のそれぞれには，特定の科目に対する n 人の生徒の得点がある．
pj,k は，生徒 k の科目 j に対する得点を表す整数である (1 ≤ j ≤ m，1 ≤ k ≤ n)．
この値は，0 ≤ pj,k ≤ 1000 を満たす．

入力の終わりは二つのゼロからなる行で表される． データセットの個数は 100 を超えない．

Output
各データセットについて，合計点が最も高い生徒の合計点を出力せよ．
生徒 k の合計点 sk とは sk = p1,k + … + pm,k のことである．

Sample Input
5 2
10 20 30 40 50
15 25 35 45 55
6 3
10 20 30 15 25 35
21 34 11 52 20 18
31 15 42 10 21 19
4 2
0 0 0 0
0 0 0 0
0 0
Output for the Sample Input
105
83
0

 */

/**
 * URL
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=1632&lang=ja
 */

class Main {

	public static void main(String[] args) throws Exception {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			Integer numDataSet = 0;
			String[] data;
			Integer numStudent;
			Integer numSubject;
			Integer[] total;
			String[] point;
			Integer max;
			Integer[] result = new Integer[100];

			while(true){
				data = reader.readLine().split(" ");
				numStudent = Integer.parseInt(data[0]);
				numSubject = Integer.parseInt(data[1]);
				// 生徒数と科目数がどちらも0の場合、ループを抜ける
				if(numStudent == 0 && numSubject == 0) break;

				total = new Integer[numStudent];

				// 科目の数分ループ
				for(int i=0;i<numSubject;i++){
					point = reader.readLine().split(" ");

					// 生徒の人数分ループ
					for(int j=0;j<numStudent;j++){
						if(i==0) total[j] = Integer.parseInt(point[j]);
						else total[j] += Integer.parseInt(point[j]);
					}
				}

				max = total[0];
				for(int i=1;i<total.length;i++){
					int val = total[i];
					if(val > max) max = val;
				}

				result[numDataSet] = max;
				numDataSet++;

			}

			for(int i=0;i<numDataSet;i++){
				System.out.println(result[i]);
			}

		}
	}
}







