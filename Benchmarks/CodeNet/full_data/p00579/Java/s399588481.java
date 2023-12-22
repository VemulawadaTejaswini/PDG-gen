import java.util.Scanner;

class Main {

	static long[] beauty;  //美しさ
	static int[] L;
	static int[] R;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int treeNum = sc.nextInt();
			beauty = new long[treeNum];
			boolean[] illumination = new boolean[treeNum];  //イルミネーション trueついてる falseついてない
			int mNum = sc.nextInt();
			L = new int[mNum];
			R = new int[mNum];
			for (int i=0; i<treeNum; i++) {
				beauty[i] = sc.nextLong();  //美しさを読み込み
				illumination[i]  = true;
			}
			for (int i=0; i<mNum; i++) {  //LとRを記録
				L[i] = sc.nextInt()-1;
				R[i] = sc.nextInt()-1;
			}
			long max_beauty = allPattern(-1l,illumination,0);
			System.out.println(max_beauty);
		}
	}

	public static long allPattern(long max,boolean[] illu, int pointer){  //maxの美しさ、イルミネーションの状態、何番目のルール
		if (pointer >= L.length) {  //ルールの数
			Long b = 0l;
			for (int i=0; i<beauty.length; i++) {
				//System.out.println(i + "-------" + illu[i]);
				if (illu[i]) {  //ついているなら
					b += beauty[i];  //美しさを加算
				}
			}
			//System.out.println(b);
			max=Math.max(max,b);
		} else {
			for (int i=L[pointer]; i<=R[pointer]; i++) {
				boolean[] copy = new boolean[illu.length];
				for (int j=0; j<illu.length; j++) copy[j] = illu[j];  //コピーする
				for (int j=L[pointer]; j<=R[pointer]; j++) copy[j] = false;  //まず範囲内をイルミネーションを全部消す
				if (illu[i]) {  //すでに消したら処理しない
					copy[i] = true;  //一個ずつつけて再帰する
				}
				max = allPattern(max,copy,pointer+1);
			}
		}
		return max;
	}
}
